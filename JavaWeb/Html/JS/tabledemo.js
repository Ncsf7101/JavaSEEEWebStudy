var rows = 5;
var cols = 10;
document.write("<table border=\"1\" width=\"80%\">");
for(i = 1; i <= rows; i++){
	document.write("<tr>");
	for(j = 1; j <= cols; j++){
		document.write("<td>" + i*j + "</td>");
	}
	document.write("</tr>");
}
document.write("</table>");