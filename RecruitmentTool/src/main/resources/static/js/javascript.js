/* To trouble shoot javascript loading onto a HTML webpage,
 * uncomment the function below:
function showAlert() {
    alert("The button was clicked!");
}
* and then copy and paste the following <div> somewhere on the webpage.
<div>
	<button type="button" th:onclick="showAlert()">Show Alert</button>
</div>
window.onload = function() {
				setTimeout(myURL, 10000);
			}
			function myURL() {
				document.location.href="/";
			}
*/
function redirectAfterTime(myUrl, seconds){
	setTimeout(redirectUrl, seconds*1000);
	
	function redirectUrl(){
		document.location.href=myUrl;
	}
}