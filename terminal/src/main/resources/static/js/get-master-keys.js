$(document).ready(function() {

    $('#button-get-keys').click(function () {
       var terminalNumber = $('#terminal-number').val();
       $.ajax({
           url: 'http://localhost:8080/decrypted-keys/' + terminalNumber,
           method: 'GET'
       }).done(function (decryptedKeys) {
           var decryptedKeysJson = JSON.stringify(decryptedKeys, null, 2);
           $('#textarea-decrypted-keys').val(decryptedKeysJson);
       })
    });
});