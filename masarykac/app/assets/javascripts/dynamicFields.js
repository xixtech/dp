/**
 * Created by Martin on 19.03.2017.
 */
var counter = 1;
function addInput(divName){
        var newdiv = document.createElement('div');

        newdiv.innerHTML = "Entry " + (counter + 1) + " <br><input type='text' class='form-control' name='names[]'><input type='text' class='form-control' name='values[]'>";
        document.getElementById(divName).appendChild(newdiv);

        counter++;



}
function addRow(tableID) {

    var table = document.getElementById(tableID);

    var rowCount = table.rows.length;
    var row = table.insertRow(rowCount);

    var cell1 = row.insertCell(0);
    var element1 = document.createElement("input");
    element1.type = "checkbox";
    element1.name="chkbox[]";
    cell1.appendChild(element1);

    var cell2 = row.insertCell(1);
    cell2.innerHTML = rowCount + 1;

    var cell3 = row.insertCell(2);
    var element2 = document.createElement("input");
    element2.type = "text";
    element2.name = "txtbox[]";
    cell3.appendChild(element2);


}

function deleteRow(tableID) {
    try {
        var table = document.getElementById(tableID);
        var rowCount = table.rows.length;

        for(var i=0; i<rowCount; i++) {
            var row = table.rows[i];
            var chkbox = row.cells[0].childNodes[0];
            if(null !== chkbox && true === chkbox.checked) {
                table.deleteRow(i);
                rowCount--;
                i--;
            }


        }
    }catch(e) {
        alert(e);
    }
}

$(document).ready(function() {
    var max_fields      = 10; //maximum input boxes allowed
    var wrapper         = $(".input_fields_wrap"); //Fields wrapper
    var add_button      = $(".add_field_button"); //Add button ID

    var x = 1; //initlal text box count
    $(add_button).click(function(e){ //on add input button click
        e.preventDefault();
        if(x < max_fields){ //max input box allowed
            x++; //text box increment
            $(wrapper).append('<div><input type="text" name="mytext[]"/><a href="#" class="remove_field">Remove</a></div>'); //add input box
        }
    });

    $(wrapper).on("click",".remove_field", function(e){ //user click on remove text
        e.preventDefault(); $(this).parent('div').remove(); x--;
    });
});

$('.removeProfile').live('click', function(e) {
    $(this).parents('.profile').remove();
    renumber();
});

$('.removePhone').live('click', function(e) {
    var phones = $(this).parents('.phones');
    $(this).parents('.phone').remove();
    renumber(phones);
});

$('.addPhone').live('click', function(e) {
    var phones = $(this).parents('.phones');
    var template = $('.phone_template', phones);
    template.before('<div class="clearfix phone">' + template.html() + '</div>');
    renumber(phones);
});

$('.addProfile').live('click', function(e) {
    var template = $('.profile_template');
    template.before('<div class="twipsies well profile">' + template.html() + '</div>');
    renumber();
});

$('#form').submit(function() {
    $('.phone_template').remove();
    $('.profile_template').remove();
});

// -- renumber fields

// Rename fields to have a coherent payload like:
//
// informations[0].label
// informations[0].email
// informations[0].phones[0]
// informations[0].phones[1]
// ...
//
// This is probably not the easiest way to do it. A jQuery plugin would help.

var renumber = function(phones) {
    $('.profile').each(function(i) {
        $('input', this).each(function() {
            $(this).attr('name', $(this).attr('name').replace(/informations\[.+?\]/g, 'informations[' + i + ']'));
        });
        $('.phone input', this).each(function(i) {
            $(this).attr('name', $(this).attr('name').replace(/phones\[.+\]/g, 'phones[' + i + ']'));
        });
    });
};


