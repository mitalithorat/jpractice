// 1 

//  i=0;
// $(function(){
//  $("button").click(function(){
//      $("span").text(i=i+1);
//  });
// });
// 2 scroll
// $(function(){
//     $("button").click(function(){
//         $("html,body").animate({scrollTop:0},"slow");
//     });
// });
// 3  $(function(){
//     $(document).on('contextmenu',function(){
//     return false;
//     });
// })
// 4
// $(function(){
//     $('#accept').click(function(){
//         if($('#submitbtn').is(':disabled')){
//             $('#submitbtn').removeAttr('disabled');
//         }
//         else{
//             $('#submitbtn').attr('disabled','disabled');
//         }
//     });
// });
// 6
// $(function(){
//     $('.blink').fadeOut(500);
//     $('.blink').fadeIn(500);
// })
// setInterval(blink_text,1000);
// 8
// $(function(){
//     $('a.print').click(function(){
//         window.print();
//         return false;
//     });
// });
// 7
// $(function() {
//     $("tr:even").css("background-color","pink");
   
//    });
//    9
maxlength=0;
$(function(){
 $("textarea").keypress(function(){
     $("button").text(maxlength=maxlength+1);
 });
})
//10
// print alert message
    // function countCharacters(){
    //     var value=$("#textarea").val();
    //     var length=value.length;
    //     alert(length);
    // };

//20
// $(function(){
//        $(document).on('contextmenu',".element",function(){
//         alert('right mouse click!');
//          return false;
//          });
//          $(document).on('click',".element",function(){
//             alert('left mouse click!');
//             return true;
//          })
//         });
// 14
// function new_element(){
//     $("#head ul").append('<li>java</li>');
// }
// 19
function remove(){
    $("#input").css("border","0");
}