package com.handshake.interviews;

import static spark.Spark.exception;
import static spark.Spark.get;
import static spark.Spark.port;

import com.handshake.interviews.alarms.AlarmsController;

public class Application {
	
	
    public static void main(String[] args) {
    		
		// Configure Spark
		port(3001);
		
		// Set up routes
		get("/index", AlarmsController.serveIndexPage);
		
		// Convenience to print out any exceptions to the console
		exception(Exception.class, (exception, request, response) -> {
		    exception.printStackTrace();
		});
		
    }
}