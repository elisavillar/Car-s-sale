<html>
<head>
<title>Saved Data</title>

<link rel="stylesheet" type="text/css" href="formStyle.css">
<script type="text/javascript">
	function getValue(varname) {
		// First, we load the URL into a variable
		var url = decodeURIComponent(window.location.href);

		// Next, split the url by the ?
		var qparts = url.split("?");

		// Check that there is a querystring, return "" if not
		if (qparts.length == 0) {
			return "";
		}

		// Then find the querystring, everything after the ?
		var query = qparts[1];

		// Split the query string into variables (separates by &s)
		var vars = query.split("&");

		// Initialize the value with "" as default
		var value = "";

		// Iterate through vars, checking each one for varname
		for (i = 0; i < vars.length; i++) {
			// Split the variable by =, which splits name and value
			var parts = vars[i].split("=");

			// Check if the correct variable
			if (parts[0] == varname) {
				// Load value into variable
				value = parts[1];

				// End the loop
				break;
			}
		}

		// Return the value
		return value;
	}
// end hide -->
</script>


</head>
<body>

	<div class="container">
		<form id="contact" action="" method="GET">

			<h3>Data Saved:</h3>

			<h4>
				<b> Personal Info </b><br>

				<script type="text/javascript">
				<!-- hide
					var name = getValue("name");
					name = name.replace("\+", " ");
					document.write("Name: " + name + "<br>");
					var address = getValue("address");
					address = address.replace(/\+/g, " ");
					document.write("Address: " + address + "<br>");
					var city = getValue("city");
					city = city.replace(/\+/g, " ");
					document.write("City: " + city + "<br>");
					var province = getValue("Province");
					province = province.replace(/\+/g, " ");
					document.write("Province: " + province + "<br>");
					var postal = getValue("postal");
					postal = postal.replace("\+", " ");
					document.write("Postal code: " + postal + "<br>");
					var phone = getValue("phone");
					document.write("Phone number: " + phone + "<br>");
					var email = getValue("email");
					document.write("Email: " + email + "<br>");
				</script>

				<br>
				<b>Vehicle Features</b><br>

				<script type="text/javascript">
					var make = getValue("make");
					make = make.replace(/\+/g, " ");
					document.write("Make: " + make + "<br>");
					var model = getValue("model");
					model = model.replace(/\+/g, " ");
					document.write("Model: " + model + "<br>");
					var year = getValue("year");
					document.write("Year: " + year + "<br>");
					var AC = getValue("AC");
					if (AC == "AC") {
						AC = "Yes";
					} else {
						AC = "No";
					}
					document.write("Air Conditioner: " + AC + "<br>");
					var Seats = getValue("Seats");
					if (Seats == "AC") {
						Seats = "Yes";
					} else {
						Seats = "No";
					}
					document.write("Heated Seats: " + Seats + "<br>");
					var Camera = getValue("Camera");
					if (Camera == "AC") {
						Camera = "Yes";
					} else {
						Camera = "No";
					}
					document.write("Back up Camera: " + Camera + "<br>");
					var TPMS = getValue("TPMS");
					if (TPMS == "AC") {
						TPMS = "Yes";
					} else {
						TPMS = "No";
					}
					document.write("TPMS: " + TPMS + "<br>");
					var mileage = getValue("mileage");
					document.write("Mileage: " + mileage + " KM <br>");
				</script>

				<br>
				<b>Vehicle Ownership</b><br>

				<script type="text/javascript">
					var owner = getValue("owner");
					owner = owner.replace(/\+/g, " ");
					document.write("Type of owner: " + owner + "<br>");
				</script>
				<b><br>Link<br></b>
				<script type="text/javascript">
					var link = "http://www.jdpower.com/cars/" + make + "/"
							+ model + "/" + year;
					document.write('<a href="' + link + '">JD Power Link</a>');
				</script>
			</h4>

			<fieldset>
				<a href="home.html"><button type="button">Home</button></a>
			</fieldset>
		</form>
	</div>
	<?php  
$data = @($_GET['name']).'*'.@($_GET['address']).'*'.@($_GET['city']).'*'.@($_GET['Province']).'*'.@($_GET['postal']).'*'.@($_GET['phone']).'*'.@($_GET['email']).'*'.@($_GET['make']).'*'.@($_GET['model']).'*'.@($_GET['year']).'*'.@($_GET['AC']).'*'.@($_GET['Seats']).'*'.@($_GET['Camera']).'*'.@($_GET['TPMS']).'*'.@($_GET['owner']).'*'.@($_GET['mileage']).'*'.@($_GET['link']);
$fp = fopen("data.txt", "a");
fwrite($fp, $data."\n");
fclose($fp);
?>

</body>
</html>