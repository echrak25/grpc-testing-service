package com.example.grpc_server;

import demo.interfaces.grpc.GroupServiceGrpc;
import group.GroupeService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrpcServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrpcServerApplication.class, args);

		System.out.println("Starting GRPC Server");
		Server server = ServerBuilder.forPort(9090).addService(new GroupeService()).build();

		try {
			server.start();
			System.out.println("Server started at " + server.getPort());
			server.awaitTermination();
		} catch (Exception e) {
			System.out.println("Error occurred while starting the server: " + e.getMessage());
		}
	}
}
