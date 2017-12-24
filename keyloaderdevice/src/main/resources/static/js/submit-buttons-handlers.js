/**
 * Created by MKhabrat on 22.12.2017.
 */
$(document).ready(function () {

    $('#submit-mk-1').click(function () {
        var masterKeyPart1 = $('#input-mk-1').val();
        $.ajax({
            url: '/master-key/part1',
            method: 'POST',
            contentType: 'text/plain',
            data: masterKeyPart1
        });
    });

    $('#submit-mk-2').click(function () {
        var masterKeyPart2 = $('#input-mk-2').val();
        $.ajax({
            url: '/master-key/part2',
            method: 'POST',
            contentType: 'text/plain',
            data: masterKeyPart2
        });
    });
});