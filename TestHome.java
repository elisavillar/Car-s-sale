import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//comment the above line and uncomment below line to use Chrome

//import org.openqa.selenium.chrome.ChromeDriver;

public class TestHome {

	static WebDriver driver = new ChromeDriver();

	public static String generateName() {
		Random aleatory = new Random();
		String name = null;
		final String[] names = { "Marina Hoeger", "Shyanne Johnston", "Alverta Harris", "Estelle King", "Lexie Cremin",
				"Hilda Olson", "Carter Hills", "Camylle Hickle", "Myrna Reichert", "Horacio Langworth", "Hermann Wolf",
				"Jerrod Beer", "Adah Ondricka", "Emmet Jerde", "Godfrey Parisian", "Rasheed Pollich", "Isom Kirlin",
				"Jovanny Stehr", "Trystan Schumm", "Onie Senger", "Emery Thompson", "Karley Guann", "Vida Heller",
				"Thelma O'Conner", "Rudy Wuckert", "Wilbert Hermann", "Otho Reilly", "Walter Corkery", "Kallie Cassin",
				"Theron Kilback", "Germaine Kautzer", "Robin Hermiston", "Mariano Kessler", "Belle Haley",
				"Alexandrine Mann", "Lavern Watsica", "Shanelle Kohler", "Gustave Hahn", "Mortimer Reichel",
				"Mellie King", "Christophe Hermann", "Brisa Gibson", "Verna Rodriguez", "Lue Runte", "Cecilia Harber",
				"Marie Casper", "Frank Moen", "Chandler Medhurst", "Modesta Trantow", "Okey Daugherty", "Kayla Wisozk",
				"Nakia Dare", "Kelsie Hagenes", "Ramon Kreiger", "Jameson Lynch", "Amya Koch", "Dayana Borer",
				"Shanny Anderson", "Elsa Howe", "Kameron Ernser", "Gunner Weimann", "Carmen Bahringer", "Waldo Sauer",
				"Keyon Kreiger", "Shanon Hessel", "Bryana Streich", "Myriam Mante", "Rigoberto Baumbach",
				"Melvin Johns Jr.", "Andy Rice II", "Kyler Stark", "Syble Torphy", "Alek O'Reilly", "Rosalinda Carter",
				"Cassandra Armstrong", "Dominique Sporer", "Hannah Schultz", "Bettie Crist", "Cody Wilkinson",
				"Kiley Wisozk", "Lulu Parisian", "Chanel Wilkinson", "Angela Wehner", "Lou Yost", "Gino Robel",
				"Lillian Kautzer", "Efrain Bruen", "Johnpaul Grady", "Aiyana Runolfsson", "Jayce Considine",
				"Dario Simonis", "Buster Sporer", "Gerson Braun", "Mazie Brown", "Lura Bednar", "Mallory Kshlerin",
				"Dena Cole", "Lexus Stamm", "Lindsay Bashirian", "Verla Nikolaus" };

		name = names[aleatory.nextInt(names.length)];

		return name;
	}

	public static String generateAddress() {
		Random aleatory = new Random();
		String address = null;
		final String[] addresses = { "315 Thad Orchard", "597 Theodore Road", "4503 Napoleon Highway",
				"421 Kulas Overpass", "1933 Oberbrunner Isle", "199 Franecki Lakes", "18321 Camren Points",
				"157 Reggie Drives", "8231 Milton Ways", "764 Jose Highway", "70580 Bauch Vista",
				"40631 Nicolas Junctions", "667 Glover Vista", "4108 Darrel Track", "781 Hoppe Path", "368 Hammes Spur",
				"909 Andres Vista", "14483 Reichel Island", "028 Frami Forks", "412 Waelchi Dam", "9826 Judson Shores",
				"545 Stroman Lodge", "037 Barton Avenue", "850 Sven Islands", "631 Nicolas Mission", "44263 Rath Fall",
				"3505 Bashirian Ramp", "57159 Yundt Springs", "101 Kiel Junctions", "082 Schuster Port",
				"9845 Dooley Mission", "9118 Goldner Path", "84591 Bode Shore", "44848 Ally Plains",
				"9177 Wilkinson Vista", "9521 Littel Vista", "328 Rohan Curve", "8271 Bins Trace", "1572 Bayer Vista",
				"75634 Marquardt Falls", "49965 Kreiger Trail", "6826 Halvorson Cliffs", "826 Welch Mews",
				"35976 Ebert Loop", "63292 Mohammed Lane", "111 Haley Avenue", "34859 Aufderhar ",
				"1483 Prosacco Village", "3266 Antonetta Harbor", "74024 Milan View", "471 Schaefer Station",
				"72019 Charles Summit", "0304 Goodwin Road", "30231 Dare Route", "2311 Aliya Creek", "584 Dwight Spur",
				"8020 Annette Skyway", "086 Zackery Drive", "9821 Anderson Crest", "643 Torphy Neck",
				"04458 Pierce Greens", "821 Jailyn Drive", "994 Green Valley", "544 Salvador Unions",
				"7653 Lonnie Mission", "18845 Graham Bridge", "6595 Thiel Pass", "92213 Schulist Grove",
				"106 Jacobs Street", "5936 Feeney Groves", "66215 Parisian Club", "03272 Cole Spur",
				"3401 Volkman Forks", "19548 Willms Springs", "3750 Davon Mill", "607 Becker Knoll",
				"15199 Hirthe Flats", "48237 Sabryna Fields", "07369 Zaria Springs", "0497 Wolff Path",
				"217 Alan Motorway", "4253 Kub Spring", "3405 Abshire Views", "44385 Bernard Unions",
				"836 Ullrich Expressway", "30104 Nadia Forest", "9105 Reinger Wall", "64626 Eloisa Skyway",
				"192 Michael Well", "691 Obie Forges", "27216 Adams Summit", "37226 Marion Mountain",
				"88175 Jovani Viaduct", "5228 Gavin Locks", "087 Boehm Way", "0812 Cassin Harbors",
				"914 Louvenia Lights", "89351 Von Knoll", "53523 Eldon Groves", "151 Reinger Hills" };

		address = addresses[aleatory.nextInt(addresses.length)];

		return address;
	}

	public static String generateCities() {
		Random aleatory = new Random();
		String city = null;
		final String[] cities = { "Barrie", "Belleville", "Brampton", "Brant", "Brantford", "Brockville",
				"Burlington", "Cambridge", "Clarence-Rockland", "Cornwall", "Dryden", "Elliot Lake",
				"Greater Sudbury", "Guelph", "Haldimand County", "Hamilton  ", "Kawartha Lakes", "Kenora",
				"Kingston  ", "Kitchener", "London  ", "Markham", "Mississauga", "Niagara Falls  ",
				"Norfolk County", "North Bay", "Orillia", "Oshawa", "Ottawa  ", "Owen Sound", "Pembroke",
				"Peterborough  ", "Pickering", "Port Colborne", "Prince Edward County", "Quinte West",
				"Richmond Hill  ", "Sarnia", "Sault Ste. Marie", "St. Catharines  ", "St. Thomas", "Stratford",
				"Temiskaming Shores", "Thorold", "Thunder Bay  ", "Timmins", "Toronto", "Vaughan", "Waterloo",
				"Welland", "Windsor" };

		city = cities[aleatory.nextInt(cities.length)];

		return city;
	}

	public static String generateProvinces() {
		Random aleatory = new Random();
		String province = null;
		final String[] provinces = { "Alberta", "British Columbia", "Manitoba", "New Brunswick",
				"Newfoundland and Labrador", "Nova Scotia", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan",
				"Northwest Territories", "Nunavut", "Yukon" };

		province = provinces[aleatory.nextInt(provinces.length)];

		return province;
	}

	public static String generatePostalCode() {
		Random aleatory = new Random();
		String postal = null;
		final String[] postalCodes = { "M1R 0E9", "M3C 0C1", "M3C 0C2", "M3C 0C3", "M3C 0E3", "M3C 0E4", "M3C 0H9",
				"M3C 0J1", "M3C 0L8", "M3C 0N6", "M3H 0C3", "M3H 6A7", "M3M 0A9", "M3M 3G1", "M4B 0A3", "M4B 2J8",
				"M4B 3E5", "M4B 3E9", "M4C 0A1", "M4C 0A2", "M4C 0A3", "M4C 0A9", "M4C 1A1", "M4C 1A3", "M4C 1A4",
				"M4C 1A5", "M4C 1A6", "M4C 1A7", "M4C 1A8", "M4C 1A9", "M4C 1B1", "M4C 1B2", "M4C 1B3", "M4C 1B4",
				"M4C 1B5", "M4C 1B6", "M4C 1B7", "M4C 1B8", "M4C 1B9", "M4C 1C1", "M4C 1C2", "M4C 1C3", "M4C 1C4",
				"M4C 1C5", "M4C 1C6", "M4C 1C7", "M4C 1C8", "M4C 1C9", "M4C 1E1", "M4C 1E2", "M4C 1E3", "M4C 1E4",
				"M4C 1E5", "M4C 1E6", "M4C 1E7", "M4C 1E8", "M4C 1E9", "M4C 1G1", "M4C 1G2", "M4C 1G4", "M4C 1G5",
				"M4C 1G6", "M4C 1G7", "M4C 1G8", "M4C 1G9", "M4C 1H1", "M4C 1H2", "M4C 1H3", "M4C 1H4", "M4C 1H5",
				"M4C 1H6", "M4C 1H7", "M4C 1H8", "M4C 1H9", "M4C 1J1", "M4C 1J2", "M4C 1J3", "M4C 1J4", "M4C 1J5",
				"M4C 1J6", "M4C 1J7", "M4C 1J8", "M4C 1J9", "M4C 1K1", "M4C 1K2", "M4C 1K3", "M4C 1K4", "M4C 1K5",
				"M4C 1K7", "M4C 1K8", "M4C 1K9", "M4C 1L1", "M4C 1L2", "M4C 1L3", "M4C 1L4", "M4C 1L5", "M4C 1L6",
				"M4C 1L7", "M4C 1L8", "M4C 1L9" };

		postal = postalCodes[aleatory.nextInt(postalCodes.length)];

		return postal;
	}

	public static String generatePhones() {
		Random aleatory = new Random();
		String phone = null;
		final String[] phones = { "587-354-3083", "544-410-5147", "797-675-4999", "691-435-3939", "296-152-3791",
				"721-284-4854", "366-221-8123", "406-894-4454", "321-575-7313", "870-949-1288", "470-657-4637",
				"231-649-9933", "751-833-8766", "700-411-7151", "987-466-5185", "800-777-8191", "370-896-8987",
				"290-251-4388", "913-557-1213", "224-480-5750", "333-862-6171", "974-800-1144", "932-855-3326",
				"460-232-5271", "735-601-7665", "583-138-4031", "931-756-8929", "595-490-5727", "757-237-1223",
				"726-742-6358", "553-608-6437", "889-307-3352", "177-392-1449", "891-496-6104", "485-218-9720",
				"331-774-9441", "573-489-5204", "991-574-7788", "231-538-5886", "768-675-6163", "720-786-2533",
				"605-124-3444", "550-628-5670", "552-637-9079", "868-768-7562", "366-198-7530", "365-909-5933",
				"518-549-3116", "790-599-1931", "152-531-7334", "976-308-1751", "939-859-1226", "392-534-6541",
				"691-320-8781", "384-809-8373", "519-171-4556", "994-413-5558", "112-637-9039", "729-409-5313",
				"898-202-1957", "265-603-1340", "629-984-4266", "865-222-6905", "705-882-3386", "860-718-2433",
				"874-610-6393", "825-157-8540", "649-562-4817", "736-401-6283", "899-808-2045", "985-952-1779",
				"745-325-9569", "391-608-7566", "144-119-8865", "628-776-8526", "994-847-5986", "498-748-3060",
				"138-140-6852", "670-544-3732", "304-685-1195", "877-817-6704", "233-907-2305", "926-249-4216",
				"175-498-8328", "265-442-2661", "543-246-3513", "546-989-9756", "375-534-3095", "325-890-6653",
				"202-597-3826", "716-433-5140", "855-480-5794", "440-946-5717", "510-692-5224", "845-467-7791",
				"713-527-9740", "410-195-5080" };

		phone = phones[aleatory.nextInt(phones.length)];

		return phone;
	}

	public static String generateEmail() {
		Random aleatory = new Random();
		String email = null;
		final String[] emails = { "sheldon@dustin.info", "derrick_lind@ross.org", "evert@hilario.ca",
				"graciela@myriam.ca", "lydia_osinski@adam.info", "eve.gerhold@wanda.ca", "ubaldo@marlene.tv",
				"ubaldo@laury.io", "nelson.effertz@golda.co.uk", "ashlee@matt.org", "keanu@lavon.info", "pat@hank.tv",
				"filiberto.reilly@grant.biz", "bill@dorothy.ca", "jaiden_stoltenberg@kali.co.uk",
				"bernadette@rodolfo.io", "anthony@cristian.tv", "walker.aufderhar@bridget.com", "teresa@gabe.biz",
				"ava@genevieve.ca", "maeve@brennan.tv", "camren.labadie@clark.us", "lillian@antonietta.net",
				"ted@zora.info", "elena_effertz@lola.com", "nathanial_olson@tyshawn.io", "myriam@jamey.name",
				"joey@lenore.info", "rebekah@preston.tv", "annetta@mustafa.name", "sierra.ratke@marlin.me",
				"blanche@sam.com", "trent_leuschke@thaddeus.com", "bethel@jadyn.us", "christiana@fleta.org",
				"darrin@santina.biz", "marjolaine.marks@alberto.me", "maddison.guann@logan.io", "guiseppe@demond.us",
				"marta@erik.me", "ransom_quitzon@britney.com", "bette_fay@carmelo.co.uk",
				"kenyon.hackett@kathryne.name", "alison_olson@raven.biz", "cleora@esperanza.co.uk", "daniela@nannie.me",
				"reilly_dietrich@marty.org", "joelle@lizzie.biz", "zoe_fay@ona.name", "cathy_corkery@yazmin.biz",
				"amanda@ismael.me", "ella@neil.us", "corine@luisa.tv", "reynold_reynolds@antonia.biz",
				"raleigh@jaylan.org", "jasmin_gleichner@hope.us", "kendra.hahn@sandy.name", "reid@demario.name",
				"alvah@antonetta.tv", "retta@sammy.io", "lonie@hermann.info", "lazaro.jenkins@annabel.info",
				"myrtle@barbara.net", "braeden.mueller@al.co.uk", "marco_herzog@chanel.co.uk", "arno_harvey@gunner.net",
				"katelyn.kerluke@sophie.us", "lesley@orpha.me", "cortney@chloe.com", "elsa@golden.io",
				"lenny.borer@libby.info", "ezequiel@vivianne.net", "vilma@niko.me", "margaret_terry@jarrell.biz",
				"dolly@king.io", "ayden@clifton.com", "kira@macey.io", "katrina@cristal.info", "marcelo@madyson.ca",
				"gisselle_lemke@catharine.me", "jovanny_franecki@leatha.ca", "jean_hansen@lydia.name",
				"demarco_morar@scottie.me", "natalia_hills@nelle.biz", "isaac@gladyce.us", "brittany@abbigail.net",
				"toy_mertz@laurianne.io", "jacklyn@justine.co.uk", "ezekiel@kyleigh.info", "armando@ashtyn.us",
				"jasper_wuckert@lenna.tv", "courtney@uriah.biz", "elza@ruby.org", "cathryn.adams@lambert.io",
				"lilla@jarod.co.uk", "sarina@shaina.ca", "lon_emmerich@marisol.com", "eve.conn@rodger.ca",
				"kaylah@kaela.net" };

		email = emails[aleatory.nextInt(emails.length)];

		return email;
	}


	public static String[] generateCar() {
		Random aleatory = new Random();
		String[] car = null;

		final String[][] cars = { { "ACURA", "C5", "2003" }, { "ACURA", "Integra", "2001" },
				{ "ACURA", "CL", "2003" }, { "ACURA", "MDX", "2019" }, { "Aston-Martin", "DB11", "2018" },
				{ "Aston-Martin", "DB9", "2016" }, { "Audi", "A3", "2016" }, { "Audi", "A4", "2019" },
				{ "Audi", "A5", "2016" }, { "Dodge", "Caliber", "2012" }, { "Dodge", "Caravan", "2007" },
				{ "FIAT", "500", "2019" }, { "FIAT", "124-Spider", "2019" }, { "Ferrari", "360", "2004" },
				{ "Ferrari", "430", "2009" }, };

		car = cars[aleatory.nextInt(cars.length)];

		return car;
	}

	public static String generateFeatures() {
		Random aleatory = new Random();
		String feature = null;
		final String[] features = { "AC", "Seats", "Camera", "TPMS" };

		feature = features[aleatory.nextInt(features.length)];

		return feature;
	}

	public static String generateOwner() {
		Random aleatory = new Random();
		String owner = null;
		final String[] ownerSelected = { "ownerOnePrev", "ownerNoPrev", "ownerMoreOne" };

		owner = ownerSelected[aleatory.nextInt(ownerSelected.length)];

		return owner;
	}

	@Test
	public static void titleSiteTest(String url, String exTitle) {
		String baseUrl = url;

		String expectedTitle = exTitle;

		String actualTitle = "";

		driver.get(baseUrl);

		actualTitle = driver.getTitle();

		assertEquals(exTitle, driver.getTitle());

		if (actualTitle.contentEquals(expectedTitle))

			System.out.println(exTitle + " Title Test Passed!");

	}

	@Test
	public static void checkBoxTest(String checkBox) {
		driver.get("http://localhost/Project%202/newCar.html");

		WebElement checkBoxSelected = driver.findElement(By.name(checkBox));

		Assert.assertFalse(checkBoxSelected.isSelected());

		System.out.println("CheckBox " + checkBox + " Assertion Passed successfully");
	}

	@Test
	public static void checkInvalidInput(String id, String invalidInput) {
		driver.get("http://localhost/Project%202/newCar.html");
		driver.findElement(By.id(id)).sendKeys(invalidInput);
		WebElement save = driver.findElement(By.xpath("//button[text()='Save']"));
		save.click();
		String actualUrl = "http://localhost/project%202/savedcar.php";
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertNotEquals(expectedUrl, actualUrl);
		System.out.println(id + " Invalid Input Assertion Passed successfully");
	}

	@Test
	public static void checkValidInput() {
		Random aleatory = new Random();
		String[] car = generateCar();
	
		driver.get("http://localhost/Project%202/newCar.html");
		driver.findElement(By.id("name")).sendKeys(generateName());
		driver.findElement(By.id("address")).sendKeys(generateAddress());
		driver.findElement(By.id("city")).sendKeys(generateCities());
		new Select(driver.findElement(By.id("province"))).selectByVisibleText(generateProvinces());
		driver.findElement(By.id("postal")).sendKeys(generatePostalCode());
		driver.findElement(By.id("phone")).sendKeys(generatePhones());
		driver.findElement(By.id("email")).sendKeys(generateEmail());
		driver.findElement(By.id("make")).sendKeys(car[0]);
		driver.findElement(By.id("model")).sendKeys(car[1]);
		driver.findElement(By.id("year")).sendKeys(car[2]);
		
		for (int i = 0; i < aleatory.nextInt(3); i++) {
			driver.findElement(By.id(generateFeatures())).click();
		}
		driver.findElement(By.id(generateOwner())).click();
		
		WebElement slider = driver.findElement(By.id("mileage"));
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(slider, aleatory.nextInt(150), 0).build();
        action.perform();
		
		driver.findElement(By.xpath("//button[text()='Save']")).submit();
		
		System.out.println("Valid Data Assertion Passed successfully");
		
		String link = "https://www.jdpower.com/Cars/" + car[2] + "/" + car[0]; 
		
		checkValidLink(link);
	}

	@Test
	public static void checkValidLink(String actualUrl) {
		
		driver.findElement(By.linkText("JD Power Link")).click();		
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertNotEquals(expectedUrl, actualUrl);
		System.out.println("Valid Link Assertion Passed successfully");
	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Matt\\Desktop\\chromedriver.exe");

		titleSiteTest("http://localhost/Project%202/home.html", "Home");
		titleSiteTest("http://localhost/Project%202/newCar.html", "Enter data");
		titleSiteTest("http://localhost/Project%202/savedCar.php", "Saved Data");
		titleSiteTest("http://localhost/Project%202/search.php", "List of all saved info");

		checkBoxTest("Seats");
		checkBoxTest("AC");
		checkBoxTest("Camera");
		checkBoxTest("TPMS");

		checkInvalidInput("phone", "123");
		checkInvalidInput("email", "test");
		checkInvalidInput("postal", "test");
		checkInvalidInput("name", "");
		checkInvalidInput("address", "");
		checkInvalidInput("make", "");

		checkValidInput();

		driver.close();

	}

}