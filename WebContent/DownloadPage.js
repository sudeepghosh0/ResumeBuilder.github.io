/**
 * 
 */
var slideIndex = 1;
showDivs(slideIndex);

function plusDivs(n) {
  showDivs(slideIndex += n);
}

function showDivs(n) {
  var i;
  var x = document.getElementsByClassName("mySlides");
  if (n > x.length) {slideIndex = 1}
  if (n < 1) {slideIndex = x.length}
  for (i = 0; i < x.length; i++) {
     x[i].style.display = "none";
  }
  x[slideIndex-1].style.display = "block";
}
<a class="w3-btn-floating" style="position:absolute;top:150%;left:0" onclick="plusDivs(-1)"><</a>
<a class="w3-btn-floating" style="position:absolute;top:150%;right:0" onclick="plusDivs(1)">></a>