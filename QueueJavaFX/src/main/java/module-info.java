module QueueJavaFX {


	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.media;

	requires jackson.databind;
	requires jackson.core;
	requires jackson.dataformat.xml;
	requires jackson.annotations;
	
	requires java.sql;
	
	
	exports application;
	exports application.model;
	exports application.view;
	
	opens application to javafx.fxml;
	opens application.model to javafx.fxml;
	opens application.view to javafx.fxml;
	
//	opens app.controller to javafx.fxml;
	
}