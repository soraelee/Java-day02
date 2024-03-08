package ex01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.*;
import javafx.scene.chart.PieChart.Data;

public class Controller implements Initializable{
	@FXML public PieChart pieChart;
	@FXML public BarChart barChart;
	@FXML public AreaChart areaChart;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//bar Chart
		XYChart.Series<String, Integer> ser1 = new XYChart.Series<>(); //Series �ڷ����� ���
		ser1.setName("����");
		ser1.setData(FXCollections.observableArrayList(
				new XYChart.Data("2021", 50),
				new XYChart.Data("2022", 100),
				new XYChart.Data("2023", 75),
				new XYChart.Data("2024", 90)
				));
		
		XYChart.Series<String, Integer> ser2 = new XYChart.Series<>();
		ser2.setName("����");
		ser2.setData(FXCollections.observableArrayList(
				new XYChart.Data("2021", 70),
				new XYChart.Data("2022", 80),
				new XYChart.Data("2023", 55),
				new XYChart.Data("2024", 100)
				));
//		1�� : �ø��� �״�� �� ��Ʈ�� �����Ϳ� �����Ͽ� �Է�
		barChart.getData().add(ser1);
		barChart.getData().add(ser2);
		
//		2�� : ����Ʈ �����Ͽ� ����Ʈ�� ���� bar��Ʈ�� �Է�
//		ObservableList li1 =FXCollections.observableArrayList();
//		li1.add(ser1);
//		li1.add(ser2);
//		barChart.setData(li1);
		
		
		//Area Chart
		XYChart.Series<String, Integer> ser3 = new XYChart.Series<>();
		ser3.setName("�µ�");
		ser3.setData(FXCollections.observableArrayList(
				new XYChart.Data("2021", 20),
				new XYChart.Data("2022", 21),
				new XYChart.Data("2023", 19),
				new XYChart.Data("2024", 22)
				));
		areaChart.getData().add(ser3);
	}
	public void testFunc() {
		/*
		pieChart.setData(FXCollections.observableArrayList(
				new PieChart.Data("Java", 10),
				new PieChart.Data("PYTHON", 20),
				new PieChart.Data("JavaFX", 30),
				new PieChart.Data("CPP", 40)
				));
				*/
		
		ObservableList<Data> list = FXCollections.observableArrayList();
		Data d1 = new PieChart.Data("JAVA", 10);
		list.add(d1);
		Data d2 = new PieChart.Data("PYTHON", 20);
		list.add(d2);
		Data d3 = new PieChart.Data("JavaFX", 30);
		list.add(d3);
		Data d4 = new PieChart.Data("CPP", 40);
		list.add(d4);
		
		pieChart.setData(list);
	}
	

}
