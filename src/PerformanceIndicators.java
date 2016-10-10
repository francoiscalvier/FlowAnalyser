import java.util.GregorianCalendar;
import java.util.HashMap;

public class PerformanceIndicators {
	
	static HashMap<Long,Double> domesticVolume;
	static HashMap<Long,Double> nonDomesticVolume;
	static HashMap<Long,Double> uncountedVolume;
	static HashMap<Long,Double> serviceVolume;
	static HashMap<Long,Double> exportedVolume;
	static HashMap<Long,Double> producedVolume;
	static HashMap<Long,Double> importedVolume;
	static HashMap<Long,Double> linearMeasurement;
	static HashMap<Long, Double> linearRenewal;
	static HashMap<Long,Integer> unscheduleDisrupt;
	static HashMap<Long,Integer> subscriberNumber;
	static HashMap<Long,Integer> unconformMicrobioSamplingNumber;
	static HashMap<Long,Integer> microbioSamplingNumber;
	static HashMap<Long,Integer> unconformPhysicoSamplingNumber;
	static HashMap<Long,Integer> physicoSamplingNumber;
	static HashMap<Long,Double> exTaxPrice;
	static HashMap<Long,Double> taxRate;
	static HashMap<Long,Integer> claimNumber;
	static HashMap<Long,Integer> inhabitants;
	
	private static double averageInhabitants=0;
	private static double averageDomesticVolume=0;
	private static double averageNonDomesticVolume=0;
	private static double averageUncountedVolume=0;
	private static double averageServiceVolume=0;
	private static double averageExportedVolume=0;
	private static double averageProducedVolume=0;
	private static double averageImportedVolume=0;
	private static double averageLinearMeasurement=0;
	private static double averageUnconformMicrobioSamplingNumber=0;
	private static double averageMicrobioSamplingNumber=0;
	private static double averageUnconformPhysicoSamplingNumber=0;
	private static double averagePhysicoSamplingNumber=0;
	private static double averageSubscriberNumber=0;
	private static double averageClaimNumber=0;
	private static double averageTaxRate=0;
	private static double averageExTaxPrice=0;
	private static int averageUnscheduleDisrupt=0;
	private static double averageLinearRenewal=0;

	
	public static double getAverageMicrobioSamplingNumber() {
		return averageMicrobioSamplingNumber;
	}
	public static double getAverageTaxRate() {
		return averageTaxRate;
	}
	public static double getAverageUnconformMicrobioSamplingNumber() {
		return averageUnconformMicrobioSamplingNumber;
	}
	public static double getAveragePhysicoSamplingNumber() {
		return averagePhysicoSamplingNumber;
	}
	public static double getAverageInhabitants() {
		return averageInhabitants;
	}
	public static double getAverageDomesticVolume() {
		return averageDomesticVolume;
	}
	public static double getAverageNonDomesticVolume() {
		return averageNonDomesticVolume;
	}
	public static double getAverageUncountedVolume() {
		return averageUncountedVolume;
	}
	public static double getAverageServiceVolume() {
		return averageServiceVolume;
	}
	public static double getAverageExportedVolume() {
		return averageExportedVolume;
	}
	public static double getAverageProducedVolume() {
		return averageProducedVolume;
	}
	public static double getAverageImportedVolume() {
		return averageImportedVolume;
	}
	public static double getAverageLinearMeasurement() {
		return averageLinearMeasurement;
	}
	public static double getAverageUnconformPhysicoSamplingNumber() {
		return averageUnconformPhysicoSamplingNumber;
	}
	public static double getAverageSubscriberNumber() {
		return averageSubscriberNumber;
	}
	public static double getAverageClaimNumber() {
		return averageClaimNumber;
	}
	public static double getAverageExTaxPrice() {
		return averageExTaxPrice;
	}
	public static int getAverageUnscheduleDisrupt() {
		return averageUnscheduleDisrupt;
	}
	public static double getAverageLinearRenewal() {
		return averageLinearRenewal;
	}
	
	
	public static void init(){
		domesticVolume = new HashMap<Long,Double>();
		nonDomesticVolume = new HashMap<Long,Double>();
		uncountedVolume = new HashMap<Long,Double>();
		serviceVolume = new HashMap<Long,Double>();
		exportedVolume = new HashMap<Long,Double>();
		producedVolume = new HashMap<Long,Double>();
		importedVolume = new HashMap<Long,Double>();
		linearMeasurement = new HashMap<Long,Double>();
		linearRenewal = new HashMap<Long,Double>();
		unscheduleDisrupt = new HashMap<Long,Integer>();
		subscriberNumber = new HashMap<Long,Integer>();
		unconformMicrobioSamplingNumber = new HashMap<Long,Integer>();
		microbioSamplingNumber = new HashMap<Long,Integer>();
		unconformPhysicoSamplingNumber = new HashMap<Long,Integer>();
		physicoSamplingNumber = new HashMap<Long,Integer>();
		exTaxPrice = new HashMap<Long,Double>();
		taxRate = new HashMap<Long,Double>();
		claimNumber = new HashMap<Long,Integer>();
		inhabitants = new HashMap<Long,Integer>();
		
		
		GregorianCalendar d = new GregorianCalendar(2010, 0, 1); 
		GregorianCalendar end = new GregorianCalendar(2016, 0, 1); 
		while(d.before(end)){
			long time = d.getTimeInMillis();
			inhabitants.put(time, 1000);
			domesticVolume.put(time, 15000d);
			nonDomesticVolume.put(time, 10000d);
			uncountedVolume.put(time, 5000d);
			serviceVolume.put(time, 5000d);
			exportedVolume.put(time, 15000d);
			producedVolume.put(time, 35000d);
			importedVolume.put(time, 15000d);
			linearMeasurement.put(time, 1500000d);
			unconformMicrobioSamplingNumber.put(time, 1);
			microbioSamplingNumber.put(time, 3);
			unconformPhysicoSamplingNumber.put(time, 1);
			physicoSamplingNumber .put(time, 2);
			
			subscriberNumber.put(time,400);
			claimNumber.put(time,1);
			taxRate.put(time,.2);
			exTaxPrice.put(time,3d);
			unscheduleDisrupt.put(time,1);
			linearRenewal.put(time,30d);
			
			d.add(GregorianCalendar.DAY_OF_YEAR, 1);
			
		}



	}

	public static void computeAverage (GregorianCalendar begining, GregorianCalendar end){
		GregorianCalendar d = new GregorianCalendar(begining.get(GregorianCalendar.YEAR),
				begining.get(GregorianCalendar.MONTH), begining.get(GregorianCalendar.DATE));
		int nbDays =0;
		averageInhabitants=0;
		averageDomesticVolume=0;
		averageNonDomesticVolume=0;
		averageUncountedVolume=0;
		averageServiceVolume=0;
		averageExportedVolume=0;
		averageProducedVolume=0;
		averageImportedVolume=0;
		averageLinearMeasurement=0;
		averageUnconformMicrobioSamplingNumber=0;
		averageMicrobioSamplingNumber=0;
		averageUnconformPhysicoSamplingNumber=0;
		averagePhysicoSamplingNumber=0;
		averageSubscriberNumber=0;
		averageClaimNumber=0;
		averageTaxRate=0;
		averageExTaxPrice=0;
		averageUnscheduleDisrupt=0;
		averageLinearRenewal=0;
		
		while(!d.after(end)){
			nbDays++;
			long time = d.getTimeInMillis();
			averageInhabitants+=inhabitants.get(time);
			averageDomesticVolume+=domesticVolume.get(time);
			averageNonDomesticVolume+=nonDomesticVolume.get(time);
			averageUncountedVolume+=uncountedVolume.get(time);
			averageServiceVolume+=serviceVolume.get(time);
			averageExportedVolume+=exportedVolume.get(time);
			averageProducedVolume+=producedVolume.get(time);
			averageImportedVolume+=importedVolume.get(time);
			averageLinearMeasurement+=linearMeasurement.get(time);
			averageUnconformMicrobioSamplingNumber += unconformMicrobioSamplingNumber.get(time);
			averageMicrobioSamplingNumber+= microbioSamplingNumber.get(time);
			averageUnconformPhysicoSamplingNumber+=unconformPhysicoSamplingNumber.get(time);
			averagePhysicoSamplingNumber+=physicoSamplingNumber.get(time);
			averageSubscriberNumber+=subscriberNumber.get(time);
			averageClaimNumber+=claimNumber.get(time);
			averageTaxRate+= taxRate.get(time);
			averageExTaxPrice+=exTaxPrice.get(time);
			averageUnscheduleDisrupt+=unscheduleDisrupt.get(time);
			averageLinearRenewal+=linearRenewal.get(time);
			
			d.add(GregorianCalendar.DAY_OF_YEAR, 1);	
			
		}
		averageInhabitants/=nbDays;
		averageDomesticVolume/=nbDays;
		averageNonDomesticVolume/=nbDays;
		averageUncountedVolume/=nbDays;
		averageServiceVolume/=nbDays;
		averageExportedVolume/=nbDays;
		averageProducedVolume/=nbDays;
		averageImportedVolume/=nbDays;
		averageLinearMeasurement/=nbDays;
		averageUnconformMicrobioSamplingNumber/= nbDays;
		averageMicrobioSamplingNumber/= nbDays;
		averageUnconformPhysicoSamplingNumber/=nbDays;
		averagePhysicoSamplingNumber/=nbDays;
		averageSubscriberNumber/=nbDays;
		averageClaimNumber/=nbDays;
		averageTaxRate /= nbDays;
		averageExTaxPrice/=nbDays;
		averageUnscheduleDisrupt/=nbDays;
		averageLinearRenewal/=nbDays;
		
		
		
	}

	public static void computeAverage (int year){
		GregorianCalendar begining = new GregorianCalendar();
		begining.set(year, 0, 1);
		GregorianCalendar end = new GregorianCalendar();
		end.set(year+1, 0, 1);
		computeAverage(begining, end);
	}
	
	
	public static double networkEfficiency(){

		return (averageDomesticVolume + averageNonDomesticVolume + averageUncountedVolume
		+ averageServiceVolume + averageExportedVolume) 
				/ ( averageProducedVolume + averageImportedVolume) * 100;
	}


	public static double primaryPerformance(){
		return (averageDomesticVolume + averageNonDomesticVolume  + averageExportedVolume) 
				/ ( averageProducedVolume + averageImportedVolume) * 100;
	}

	public static double linearConsumption(){
		return (averageDomesticVolume + averageNonDomesticVolume + averageUncountedVolume
		+ averageServiceVolume + averageExportedVolume) 
				/ ( averageLinearMeasurement) /365;
	}


	public static double linearNetworkLoss(){
		return (averageProducedVolume + averageImportedVolume -averageExportedVolume
				-averageDomesticVolume-averageNonDomesticVolume-averageUncountedVolume
				-averageServiceVolume) 
				/  averageLinearMeasurement /365;
	}

	public static double linearUncountedVolume(){
		return (averageProducedVolume + averageImportedVolume -averageExportedVolume
				-averageDomesticVolume-averageNonDomesticVolume) 
				/ averageLinearMeasurement /365;
	}

	public static double averageTurnover(){

		return averageLinearRenewal /  averageLinearMeasurement;
	}

	public static double unscheduledDisruptRate(){

		return averageUnscheduleDisrupt / averageSubscriberNumber * 1000;
	}

	public static double conformMicrobioSamplingRate(){

		return getAverageUnconformMicrobioSamplingNumber() / getAverageMicrobioSamplingNumber();
	}
	public static double conformPhysicoSamplingRate(){

		return averageUnconformPhysicoSamplingNumber / averagePhysicoSamplingNumber;
	}

	public static double servicePrice(){

		return (exTaxBill(120) + taxes(120))/120;
	}


	private static double exTaxBill(double consumption){
		return consumption*averageExTaxPrice;
	}
	private static double taxes(double consumption){
		return exTaxBill(consumption)*getAverageTaxRate();
	}

	public static double claimRate(){
		return averageClaimNumber / averageSubscriberNumber * 1000; 
	}

	public static double linearDensity(){
		return averageSubscriberNumber / averageLinearMeasurement; 
	}

	public static double averageConsuption(){
		return (averageDomesticVolume + averageNonDomesticVolume) / averageSubscriberNumber; 
	}

	public static double inhabitantPerSuscriberRate(){
		return averageInhabitants / averageSubscriberNumber; 
	}

	public static double networkEfficiency(GregorianCalendar date){
		long time = date.getTimeInMillis();
		return (domesticVolume.get(time) + nonDomesticVolume.get(time) + uncountedVolume .get(time)
		+ serviceVolume.get(time) + exportedVolume.get(time)) 
				/ ( producedVolume.get(time) + importedVolume.get(time)) * 100;
	}


	public static double primaryPerformance(GregorianCalendar date){
		long time = date.getTimeInMillis();
		return (domesticVolume.get(time) + nonDomesticVolume.get(time)  + exportedVolume.get(time)) 
				/ ( producedVolume.get(time) + importedVolume.get(time)) * 100;
	}

	public static double linearConsumption(GregorianCalendar date){
		long time = date.getTimeInMillis();
		return (domesticVolume.get(time) + nonDomesticVolume.get(time) + uncountedVolume.get(time)
		+ serviceVolume.get(time) + exportedVolume.get(time)) 
				/ ( linearMeasurement.get(time)) /365;
	}


	public static double linearNetworkLoss(GregorianCalendar date){
		long time = date.getTimeInMillis();
		return (producedVolume.get(time) + importedVolume.get(time) -exportedVolume.get(time)
				-domesticVolume.get(time)-nonDomesticVolume.get(time)-uncountedVolume.get(time)
				-serviceVolume.get(time)) 
				/ ( linearMeasurement.get(time)) /365;
	}

	public static double linearUncountedVolume(GregorianCalendar date){
		long time = date.getTimeInMillis();
		return (producedVolume.get(time) + importedVolume.get(time) -exportedVolume.get(time)
				-domesticVolume.get(time)-nonDomesticVolume.get(time)) 
				/ ( linearMeasurement.get(time)) /365;
	}

	public static double averageTurnover(GregorianCalendar date){
		long time = date.getTimeInMillis();
		return (linearRenewal.get(time)) / ( linearMeasurement.get(time));
	}

	public static double unscheduledDisruptRate(GregorianCalendar date){
		long time = date.getTimeInMillis();
		return unscheduleDisrupt.get(time) / subscriberNumber.get(time) * 1000;
	}

	public static double conformMicrobioSamplingRate(GregorianCalendar date){
		long time = date.getTimeInMillis();
		return unconformMicrobioSamplingNumber.get(time) / microbioSamplingNumber.get(time);
	}
	public static double conformPhysicoSamplingRate(GregorianCalendar date){
		long time = date.getTimeInMillis();
		return unconformPhysicoSamplingNumber.get(time) / physicoSamplingNumber.get(time);
	}

	public static double servicePrice(GregorianCalendar date){
		long time = date.getTimeInMillis();
		return (exTaxBill(time, 120) + taxes(time, 120))/120;
	}


	private static double exTaxBill(long date, double consumption){
		return consumption*exTaxPrice.get(date);
	}
	private static double taxes(long date, double consumption){
		return exTaxBill(date,consumption)*taxRate.get(date);
	}

	public static double claimRate(GregorianCalendar date){
		long time = date.getTimeInMillis();
		return claimNumber.get(time) / subscriberNumber.get(time) * 1000; 
	}

	public static double linearDensity(GregorianCalendar date){
		long time = date.getTimeInMillis();
		return subscriberNumber.get(time) / linearMeasurement.get(time); 
	}

	public static double averageConsuption(GregorianCalendar date){
		long time = date.getTimeInMillis();
		return (domesticVolume.get(time) + nonDomesticVolume.get(time)) / subscriberNumber.get(time); 
	}

	public static double inhabitantPerSuscriberRate(GregorianCalendar date){
		long time = date.getTimeInMillis();
		return (inhabitants.get(time)) / subscriberNumber.get(time); 
	}


	


	

}
