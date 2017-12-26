/**
 * Created by Maxon on 23.12.2017.
 */
$('#btn-get-keys').click(function() {
    var terminalNumber = $('#input-deciphered-keys-id').val();
    $.ajax({
        url: '/decrypted-keys/' + terminalNumber,
        method: 'GET'
    }).done(function (decryptedKeys) {
        var keysString = JSON.stringify(decryptedKeys, null, 2);
        $('#input-decrypted-keys-response').val(keysString);
    }).fail(function (error) {
        var errorString = JSON.stringify(error, null, 2);
        $('#input-decrypted-keys-response').val(errorString);
    })
});