/**
 * Created by user on 07.06.15.
 */

$( document ).ready(function() {
    console.log( "ready!" );
    var msg = "addVote=1";
    var url = "http://localhost:8080/cats";
    $.post(url, msg, function (data) {
        console.log('ok');
    }).fail(function () {
        console.log('error');
    });
});