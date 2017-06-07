const TRAINER_SERVICE_URL = 'http://localhost:8180/simple-rest-service/rest/trainer';

$(document).ready(function() {
    /** 
     *  The script inside this ready() 
     *  will be run once the page 
     *  Document Object Model (DOM) is
     *  ready for JavaScript code to
     *  execute.
     **/
    console.log('I\'m gonna fly!');
});

/** 
 *  Add event handler function to 
 *  the selected element.
 **/
$('a#btnSearch').on('click', function() {
    find($('#inputBox').val());
});

function find(id) {
    if (id == '' || id == undefined)
        findAll();
    else
        findByID(id);
}

function findAll() {
    console.log('findAll()');
    $.ajax({
        type: 'GET',
        url: TRAINER_SERVICE_URL,
        dataType: 'json',
        success: renderResult,
        error: function(data, textStatus, xhr) {
            console.log('findAll() error: ' + data.status);
        }
    });
}

function renderResult(data) {
    var list = data == null ? [] : (data instanceof Array ? data : [data]);

    $('#result-box').empty();
    $.each(list, function(index, trainer) {
        $('#result-box').append('<li>' + trainer.name + '</li>');
    });
}