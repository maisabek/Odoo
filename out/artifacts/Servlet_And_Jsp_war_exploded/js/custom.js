$(function(){
  $('.links ul li').click(function(){
  $(this).addClass('selected').siblings('li').removeClass('selected');
  $('.Personal-Information,.change-pass,.Email-and-SMS,.Manage-Contact').hide();
  $('.'+$(this).data('class')).fadeIn();
  });
    // $(".skitter-large").skitter();
});
var btn=document.getElementById("button-delete");
function getId(){
    console.log(document.getElementById("tdId").value)
    return document.getElementById("tdId").value;
}

function searchCurrent() {
    // Declare variables
    var input, filter, table, tr, td, i, txtValue;
    input = document.getElementById("myInput");
    filter = input.value.toUpperCase();
    table = document.getElementById("myTable");
    tr = table.getElementsByTagName("tr");

    // Loop through all table rows, and hide those who don't match the search query
    for (i = 0; i < tr.length; i++) {
        td = tr[i].getElementsByTagName("td")[1];
        if (td) {
            txtValue = td.textContent || td.innerText;
            if (txtValue.toUpperCase().indexOf(filter) > -1) {
                tr[i].style.display = "";
            } else {
                tr[i].style.display = "none";
            }
        }
    }
}

function searchArch() {
    // Declare variables
    var input, filter, table, tr, td, i, txtValue;
    input = document.getElementById("archSearch");
    filter = input.value.toUpperCase();
    table = document.getElementById("archTable");
    tr = table.getElementsByTagName("tr");

    // Loop through all table rows, and hide those who don't match the search query
    for (i = 0; i < tr.length; i++) {
        td = tr[i].getElementsByTagName("td")[0];
        if (td) {
            txtValue = td.textContent || td.innerText;
            if (txtValue.toUpperCase().indexOf(filter) > -1) {
                tr[i].style.display = "";
            } else {
                tr[i].style.display = "none";
            }
        }
    }
}
var slideIndex1 = 0;
carousel1();
function carousel1() {
  var i;
  var x = document.getElementsByClassName("front-hidden");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none"; 
  }
  slideIndex1++;
  if (slideIndex1 > x.length) {slideIndex1 = 1} 
  x[slideIndex1-1].style.display = "block"; 
  setTimeout(carousel1, 1000); 
}

var slideIndex2 = 0;
carousel2();
function carousel2() {
  var i;
  var x = document.getElementsByClassName("tf");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none"; 
  }
  slideIndex2++;
  if (slideIndex2 > x.length) {slideIndex2 = 1} 
  x[slideIndex2-1].style.display = "block"; 
  setTimeout(carousel2, 2000); 
}

// $(document).ready(function($) {
//   $(window).scroll(function() {
//     var scrollPos = $(window).scrollTop(),
//         navbar = $('.x-navbar');

//     if (scrollPos > 1000) {
//       navbar.addClass('alt-color');
//     } else {
//       navbar.removeClass('alt-color');
//     }
//   });
// });