
import java.util.GregorianCalendar;
import java.util.Locale;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.Axis;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;






public class LineChartSample extends Application {
	

	@Override public void start(Stage stage) {
		PerformanceIndicators.init();
		
		stage.setTitle("Performance Indicators");
		//defining the axes
		Axis<String> xAxis = new CategoryAxis();
		NumberAxis yAxis = new NumberAxis();
		xAxis.setLabel("Months");
		//creating the chart
		final LineChart<String,Number> efficiencies = 
				new LineChart<String,Number>(xAxis,yAxis);

		efficiencies.setTitle("Network Efficiency");
		//defining a series
		XYChart.Series<String,Number> efficiency = new XYChart.Series<String,Number>();
		efficiency.setName("Efficiency");
		efficiencies.getData().add(efficiency);

		XYChart.Series<String,Number>primaryEfficiency = new XYChart.Series<String,Number>();
		primaryEfficiency.setName("Primary Efficiency");
		efficiencies.getData().add(primaryEfficiency);

		xAxis = new CategoryAxis();
		yAxis = new NumberAxis();
		final LineChart<String,Number> linearConsumption = 
				new LineChart<String,Number>(xAxis,yAxis);

		linearConsumption.setTitle("Linear Volumes");
		XYChart.Series<String,Number>consumption = new XYChart.Series<String,Number>();
		consumption.setName("Consumption");
		linearConsumption.getData().add(consumption);

		XYChart.Series<String,Number>loss = new XYChart.Series<String,Number>();
		loss.setName("Loss");
		linearConsumption.getData().add(loss);

		XYChart.Series<String,Number>uncountedIndex = new XYChart.Series<String,Number>();
		uncountedIndex.setName("Uncounted Index");
		linearConsumption.getData().add(uncountedIndex);

		xAxis = new CategoryAxis();
		yAxis = new NumberAxis();
		final LineChart<String,Number> samplingRatio = 
				new LineChart<String,Number>(xAxis,yAxis);

		samplingRatio.setTitle("Unconform Sampling Rate");
		XYChart.Series<String,Number> microbio = new XYChart.Series<String,Number>();
		microbio.setName("Microbiological");
		samplingRatio.getData().add(microbio);

		XYChart.Series<String,Number>physico = new XYChart.Series<String,Number>();
		physico.setName("Physico-chemical");
		samplingRatio.getData().add(physico);


		xAxis = new CategoryAxis();
		yAxis = new NumberAxis();
		final LineChart<String,Number> price = 
				new LineChart<String,Number>(xAxis,yAxis);

		price.setTitle("Service Price");
		price.setPrefSize(50, 50);
		XYChart.Series<String,Number> fix = new XYChart.Series<String,Number>();
		fix.setName("Fix Part");
		price.getData().add(fix);

		XYChart.Series<String,Number> counter = new XYChart.Series<String,Number>();
		counter.setName("Counter Rent");
		price.getData().add(counter);



		XYChart.Series<String,Number>waterPrice = new XYChart.Series<String,Number>();
		waterPrice.setName("Water Price");
		price.getData().add(waterPrice);

		XYChart.Series<String,Number> taxes = new XYChart.Series<String,Number>();
		taxes.setName("Taxes");
		//price.getData().add(taxes);



		xAxis = new CategoryAxis();
		yAxis = new NumberAxis();
		final AreaChart<String, Number> ressource = 
				new AreaChart<String,Number>(xAxis,yAxis);

		ressource.setTitle("Ressource");
		ressource.setPrefSize(50, 50);
		XYChart.Series<String,Number>ground = new XYChart.Series<String,Number>();
		ground.setName("Ground");
		ressource.getData().add(ground);

		XYChart.Series<String,Number>surface = new XYChart.Series<String,Number>();
		surface.setName("Surface");
		ressource.getData().add(surface);


		xAxis = new CategoryAxis();
		yAxis = new NumberAxis();
		final LineChart<String,Number> sampling = 
				new LineChart<String,Number>(xAxis,yAxis);

		sampling.setTitle("Sampling");
		sampling.setPrefSize(50, 50);
		XYChart.Series<String,Number> conformMicrobio = new XYChart.Series<String,Number>();
		conformMicrobio.setName("Microbiological");
		sampling.getData().add(conformMicrobio);

		XYChart.Series<String,Number> unconformMicrobio = new XYChart.Series<String,Number>();
		unconformMicrobio.setName("Unconform Microbiological");
		sampling.getData().add(unconformMicrobio);



		XYChart.Series<String,Number>conformPhysico = new XYChart.Series<String,Number>();
		conformPhysico.setName("Physico-chemical");
		sampling.getData().add(conformPhysico);

		XYChart.Series<String,Number>unconformPhysico = new XYChart.Series<String,Number>();
		unconformPhysico.setName("Uncoform Physico-chemical");
		sampling.getData().add(unconformPhysico);


		xAxis = new CategoryAxis();
		yAxis = new NumberAxis();
		final LineChart<String,Number> clients = 
				new LineChart<String,Number>(xAxis,yAxis);

		clients.setTitle("Clients");
		clients.setPrefSize(50, 50);
		XYChart.Series<String,Number> domestic = new XYChart.Series<String,Number>();
		domestic.setName("Domestic suscribers");
		//clients.getData().add(domestic);

		XYChart.Series<String,Number> industrial = new XYChart.Series<String,Number>();
		industrial.setName("Industrial suscribers");
		//clients.getData().add(industrial);



		XYChart.Series<String,Number>collectivities = new XYChart.Series<String,Number>();
		collectivities.setName("Collective suscribers");
		//clients.getData().add(collectivities);

		XYChart.Series<String,Number> claims = new XYChart.Series<String,Number>();
		claims.setName("Claims");
		// clients.getData().add(claims);



		XYChart.Series<String,Number>inhabitants = new XYChart.Series<String,Number>();
		inhabitants.setName("Inhabitants provided");
		clients.getData().add(inhabitants);


		xAxis = new CategoryAxis();
		yAxis = new NumberAxis();
		final LineChart<String,Number> volumes = 
				new LineChart<String,Number>(xAxis,yAxis);

		volumes.setTitle("Volumes");
		volumes.setPrefSize(50, 50);
		XYChart.Series<String,Number> service = new XYChart.Series<String,Number>();
		service.setName("Domestic suscribers");
		volumes.getData().add(service);

		XYChart.Series<String,Number> uncounted = new XYChart.Series<String,Number>();
		uncounted.setName("Uncounted Volume");
		volumes.getData().add(uncounted);

		xAxis = new CategoryAxis();
		yAxis = new NumberAxis();
		final LineChart<String,Number> linear = 
				new LineChart<String,Number>(xAxis,yAxis);

		linear.setTitle("Linear");
		linear.setPrefSize(50, 50);

		XYChart.Series<String,Number> network = new XYChart.Series<String,Number>();
		network.setName("Network");
		linear.getData().add(network);

		XYChart.Series<String,Number> renewal = new XYChart.Series<String,Number>();
		renewal.setName("Renewal");
		// linear.getData().add(renewal);


		HBox dateBox = new HBox();
		ComboBox<Integer> beginingYear = new ComboBox<Integer>();
		for(int i =2010; i<2016; i++){
			beginingYear.getItems().add(i);
		}
		ComboBox<String> beginingMonth = new ComboBox<String>();
		beginingMonth.getItems().addAll("Jan","Feb","Mar", "Apr", "May", "Jun", "Jul","Aug", "Sep",
				"Oct", "Nov", "Dec");
		ComboBox<Integer> beginingDay = new ComboBox<Integer>();
		for(int i =1; i<32; i++){
			beginingDay.getItems().add(i);
		}
		ComboBox<Integer> endYear = new ComboBox<Integer>();
		for(int i =2010; i<2016; i++){
			endYear.getItems().add(i);
		}ComboBox<String> endMonth = new ComboBox<String>();
		endMonth.getItems().addAll("Jan","Feb","Mar", "Apr", "May", "Jun", "Jul","Aug", "Sep",
				"Oct", "Nov", "Dec");
		ComboBox<Integer> endDay = new ComboBox<Integer>();
		for(int i =1; i<32; i++){
			endDay.getItems().add(i);
		}

		dateBox.getChildren().addAll(new Text("From "),beginingYear,beginingMonth,beginingDay,new Text("To "),endYear,endMonth,endDay);

		HBox sectorBox = new HBox();
		ComboBox<String> sector = new ComboBox<String>();
		sector.getItems().addAll("Solaure","Jardin Des Plantes", "Rejaillere", "Vionne", "Michon");
		sectorBox.getChildren().addAll(new Text("Sector "),sector);

		Button okButton = new Button("Ok");
		okButton.setOnAction((ActionEvent e) -> {
			GregorianCalendar begin = new GregorianCalendar(beginingYear.getValue(),
					beginingMonth.getItems().indexOf(beginingMonth.getValue()),
					beginingDay.getValue());

			GregorianCalendar end = new GregorianCalendar(endYear.getValue(),
					endMonth.getItems().indexOf(endMonth.getValue()),
					endDay.getValue());

			long nbDays = (end.getTimeInMillis()-begin.getTimeInMillis())/86400000;
			
			efficiency.getData().clear();
			primaryEfficiency.getData().clear();
			consumption.getData().clear();
			loss.getData().clear();
			uncountedIndex.getData().clear();
			microbio.getData().clear();
			physico.getData().clear();
			fix.getData().clear();
			counter.getData().clear();
			waterPrice.getData().clear();
			taxes.getData().clear();
			ground.getData().clear();
			surface.getData().clear();
			conformMicrobio.getData().clear();
			unconformMicrobio.getData().clear();
			conformPhysico.getData().clear();
			unconformPhysico.getData().clear();
			domestic.getData().clear();
			industrial.getData().clear();
			collectivities.getData().clear();
			claims.getData().clear();
			inhabitants.getData().clear();
			service.getData().clear();
			uncounted.getData().clear();
			network.getData().clear();
			renewal.getData().clear();
			
			int maxNbValues = 60;
			String date;
			if(nbDays>maxNbValues){
				int step = (int)(nbDays / maxNbValues);
				while(begin.before(end)){
					GregorianCalendar d = new GregorianCalendar(begin.get(GregorianCalendar.YEAR),
								begin.get(GregorianCalendar.MONTH), begin.get(GregorianCalendar.DATE));
					begin.add(GregorianCalendar.DATE, step);
					PerformanceIndicators.computeAverage(d, begin);
					
					date = begin.get(GregorianCalendar.DATE)
							+"-"+begin.getDisplayName(GregorianCalendar.MONTH, GregorianCalendar.SHORT, Locale.ENGLISH)
							+"-"+ begin.get(GregorianCalendar.YEAR);
					efficiency.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.networkEfficiency()));
					primaryEfficiency.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.primaryPerformance()));
					consumption.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.linearConsumption()));
					loss.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.linearNetworkLoss()));
					uncountedIndex.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.linearUncountedVolume()));
					microbio.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.conformMicrobioSamplingRate()));
					physico.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.conformPhysicoSamplingRate()));
					fix.getData().add(new XYChart.Data<String, Number>(date,15));
					counter.getData().add(new XYChart.Data<String, Number>(date, 15));
					waterPrice.getData().add(new XYChart.Data<String, Number>(date, 3));
					taxes.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.getAverageTaxRate()));
					ground.getData().add(new XYChart.Data<String, Number>(date, 0));
					surface.getData().add(new XYChart.Data<String, Number>(date, 35000));
					conformMicrobio.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.getAverageMicrobioSamplingNumber()));
					unconformMicrobio.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.getAverageUnconformMicrobioSamplingNumber()));
					conformPhysico.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.getAveragePhysicoSamplingNumber()));
					unconformPhysico.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.getAverageUnconformPhysicoSamplingNumber()));
					domestic.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.getAverageSubscriberNumber()));
					industrial.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.getAverageSubscriberNumber()));
					collectivities.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.getAverageSubscriberNumber()));
					claims.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.getAverageClaimNumber()));
					inhabitants.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.getAverageInhabitants()));
					service.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.getAverageServiceVolume()));
					uncounted.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.getAverageUncountedVolume()));
					network.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.getAverageLinearMeasurement()));
					renewal.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.getAverageLinearRenewal()));
				}
				
			}
			else{
				//populating the series with data
				while(begin.before(end)){
					date = begin.get(GregorianCalendar.DATE)
									+"-"+begin.getDisplayName(GregorianCalendar.MONTH, GregorianCalendar.SHORT, Locale.ENGLISH);
					long time = begin.getTimeInMillis();
					efficiency.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.networkEfficiency(begin)));
					primaryEfficiency.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.primaryPerformance(begin)));
					consumption.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.linearConsumption(begin)));
					loss.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.linearNetworkLoss(begin)));
					uncountedIndex.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.linearUncountedVolume(begin)));
					microbio.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.conformMicrobioSamplingRate(begin)));
					physico.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.conformPhysicoSamplingRate(begin)));
					fix.getData().add(new XYChart.Data<String, Number>(date,15));
					counter.getData().add(new XYChart.Data<String, Number>(date, 15));
					waterPrice.getData().add(new XYChart.Data<String, Number>(date, 3));
					taxes.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.taxRate.get(time)));
					ground.getData().add(new XYChart.Data<String, Number>(date, 0));
					surface.getData().add(new XYChart.Data<String, Number>(date, 35000));
					conformMicrobio.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.microbioSamplingNumber.get(time)));
					unconformMicrobio.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.unconformMicrobioSamplingNumber.get(time)));
					conformPhysico.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.physicoSamplingNumber.get(time)));
					unconformPhysico.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.unconformPhysicoSamplingNumber.get(time)));
					domestic.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.subscriberNumber.get(time)));
					industrial.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.subscriberNumber.get(time)));
					collectivities.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.subscriberNumber.get(time)));
					claims.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.claimNumber.get(time)));
					inhabitants.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.inhabitants.get(time)));
					service.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.serviceVolume.get(time)));
					uncounted.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.uncountedVolume.get(time)));
					network.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.linearMeasurement.get(time)));
					renewal.getData().add(new XYChart.Data<String, Number>(date, PerformanceIndicators.linearRenewal.get(time)));
				
					begin.add(GregorianCalendar.DATE, 1);
				}
			}
		});


		FlowPane indicators = new FlowPane();
		VBox variables = new VBox();
		HBox box = new HBox();
		GridPane root = new GridPane();
		Scene scene  = new Scene(root,800,600);


		indicators.getChildren().addAll(efficiencies, linearConsumption, samplingRatio);
		variables.getChildren().addAll(price, ressource, volumes, sampling, clients, linear);

		ScrollBar sc = new ScrollBar();
		sc.setOrientation(Orientation.VERTICAL);
		sc.valueProperty().addListener((ObservableValue<? extends Number> ov, 
				Number old_val, Number new_val) -> {
					root.setLayoutY(-new_val.doubleValue());
				});  
		sc.setLayoutX(scene.getWidth()-sc.getWidth());
		sc.setMin(0);
		sc.setOrientation(Orientation.VERTICAL);
		sc.setPrefHeight(root.getHeight());
		sc.setMax(600);

		box.getChildren().addAll(indicators, variables );
		root.add(dateBox,0,0,3,1);
		root.add(sectorBox, 0, 1,3,1);
		root.add(okButton, 2, 0,1,2);
		root.add(box,0,2,2,1);
		root.add(sc,3,0,1,3);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}