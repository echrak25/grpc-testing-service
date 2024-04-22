package group;

import demo.interfaces.grpc.GroupOuterClass;
import demo.interfaces.grpc.GroupServiceGrpc;
import io.grpc.stub.StreamObserver;

public class GroupeService extends GroupServiceGrpc.GroupServiceImplBase {
    // Unary RPC
    @Override
    public void getGroup(GroupOuterClass.Group request, StreamObserver<GroupOuterClass.Group> responseObserver) {
        System.out.println("Inside getGroup method");

        // Create a dummy group
        GroupOuterClass.Group group = GroupOuterClass.Group.newBuilder()
                .setGroupID(1)
                .setGroupParent("Parent")
                .setGroupName("Test Group")
                .setGroupNumberMembers(10)
                .build();

        responseObserver.onNext(group);
        responseObserver.onCompleted();
    }

    // Server streaming RPC
    @Override
    public void listGroups(GroupOuterClass.Empty request, StreamObserver<GroupOuterClass.Group> responseObserver) {
        System.out.println("Inside listGroups method");

        // Send 5 dummy groups
        for (int i = 0; i < 5; i++) {
            GroupOuterClass.Group group = GroupOuterClass.Group.newBuilder()
                    .setGroupID(i)
                    .setGroupParent("Parent " + i)
                    .setGroupName("Test Group " + i)
                    .setGroupNumberMembers(i * 10)
                    .build();

            responseObserver.onNext(group);
        }

        responseObserver.onCompleted();
    }

    // Client streaming RPC

    @Override
    public StreamObserver<GroupOuterClass.Group> batchCreateGroups(StreamObserver<GroupOuterClass.APIResponse> responseObserver) {
        System.out.println("Inside batchCreateGroups method");

        return new StreamObserver<GroupOuterClass.Group>() {
            @Override
            public void onNext(GroupOuterClass.Group group) {
                System.out.println("Received group in batchCreateGroups");
                // Handle each request here
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error occurred in batchCreateGroups");
                // Handle the error
            }

            @Override
            public void onCompleted() {
                System.out.println("Completed receiving groups in batchCreateGroups");

                GroupOuterClass.APIResponse response = GroupOuterClass.APIResponse.newBuilder()
                        .setResponseCode(0)
                        .setResponsemessage("BATCH GROUP CREATION COMPLETED")
                        .build();

                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }


    // Bidirectional streaming RPC
    @Override
    public StreamObserver<GroupOuterClass.Group> bidiUpdateGroups(StreamObserver<GroupOuterClass.APIResponse> responseObserver) {
        System.out.println("Inside bidiUpdateGroups method");

        return new StreamObserver<GroupOuterClass.Group>() {
            @Override
            public void onNext(GroupOuterClass.Group group) {
                System.out.println("Received group in bidiUpdateGroups");

                GroupOuterClass.APIResponse response = GroupOuterClass.APIResponse.newBuilder()
                        .setResponseCode(0)
                        .setResponsemessage("GROUP UPDATE RECEIVED")
                        .build();

                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error occurred in bidiUpdateGroups");
                // Handle the error
            }

            @Override
            public void onCompleted() {
                System.out.println("Completed receiving groups in bidiUpdateGroups");
                responseObserver.onCompleted();
            }
        };
    }
}