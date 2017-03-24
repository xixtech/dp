/**
 * Created by Martin on 19.03.2017.
 */
var counter = 1;
var cuisines = ["Chinese", "Indian"];
var choices = [["one", "1"], ["two", "2"]];
(function($) {
    var minNumber = -100;
    var maxNumber = 100;

    $('.txtinput').on("change", function() {
        var inputVal = parseFloat($(this).val().replace('%', '')) || 0;

        if (minNumber > inputVal) {
            inputVal = -100;
        } else if (maxNumber < inputVal) {
            inputVal = 100;
        }

        $(this).val(inputVal + '%');
    });


})(jQuery);

function addInputT1(divName, pole) {

    var newDiv = document.createElement('div');
    var mapKey = document.getElementById('myField').value;
    var mapValue = document.getElementById('myField2').value;
    var testKey = mapKey.split(";");
    var testValue = mapValue.split(";");

    var i, out = [];//literal new array
    for(i=0;i<testKey.length;i++)
    {
        out.push([testKey[i],testValue[i]]);
    }

    var selectHTML = "";
    selectHTML = "<div class='row'><div class='col-md-6'><select class='form-control' name='names[]'>";
    for (i = 0; i < out.length; i = i + 1) {
        selectHTML += "<option value='" + out[i][0] + "'>" + out[i][1] + "</option>";

    }
    selectHTML += "</select></div><div class='col-md-6'><input type='text' class='form-control' name='values[]'> </div></div></br>";
    newDiv.innerHTML = selectHTML;
    document.getElementById(divName).appendChild(newDiv);
}
function isNumberKey(evt){
    var charCode = (evt.which) ? evt.which : event.keyCode;
    if (charCode > 31 && (charCode != 46 &&(charCode < 48 || charCode > 57)))
        return false;
    return true;
}

function addInput(divName) {


    var s = $('<select/>');
    var o = [1, 2, 3];
    for (var i in cuisines) {
        s.append($('<option/>').html(cuisines[i]));
    }
    $('body').append(s);


    var newdiv = document.createElement('div');
    newdiv.innerHTML = "<label for='names[]'>Jméno</label><select id='CuisineList' class='form-control' name='names[]'>+'s.outerHTML'+</select><input type='text' class='form-control' name='values[]'>";
    document.getElementById(divName).appendChild(newdiv);


    var sel = document.getElementById('CuisineList');
    for (var j = 0; j < cuisines.length; j++) {
        var opt = document.createElement('option');
        opt.innerHTML = cuisines[j];
        opt.value = cuisines[j];
        sel.appendChild(opt);
    }
    counter++;

}

function addInput1(divName) {

    var newdiv = document.createElement('div');
    newdiv.innerHTML = " <div class='row'><div class='col-md-6'><select id='CuisineList' class='form-control' name='teachers.id[]'></select>  </div><div class='col-md-6'><input type='text' class='form-control' name='teachers.scale[]'> </div></div>";
    document.getElementById(divName).appendChild(newdiv);


    var sel = document.getElementById('CuisineList');
    for (var j = 0; j < cuisines.length; j++) {
        var opt = document.createElement('option');
        opt.innerHTML = cuisines[j];
        opt.value = cuisines[j];
        sel.appendChild(opt);
    }
    counter++;

}

var unitLists = new Array(2);
unitLists["0"] = ["Select"];
unitLists.Area =
    ["Square millimeters",
        "Square centimeters",
        "Square meters",
        "Square kilometers",
        "Square miles",
        "Hectares",
        "Acres",
        "Square inches",
        "Square feet",
        "Square yards"];

unitLists.Length =
    ["Nanometers",
        "Micrometers",
        "Millimeters",
        "Centimeters",
        "Meters",
        "Kilometers",
        "Miles",
        "Nautical Miles",
        "Inches",
        "Feet",
        "Yards"];


/* unitMenuChange() is called from the onchange event of a select element.
 * param selectObj - the select object which fired the on change event.
 */
function unitMenuChange(selectObj) {
    var idx = selectObj.selectedIndex;
    var which = selectObj.options[idx].value;
    uList = unitLists[which];
    var uc_selector = document.getElementById("uc_selector");

    while (uc_selector.options.length > 0) {
        uc_selector.remove(0);
    }
    var newOption;
    // create and add new options
    for (var i = 0; i < uList.length; i++) {
        newOption = document.createElement("option");
        newOption.value = uList[i];
        newOption.text = uList[i];
        try {
            uc_selector.add(newOption);
        }
        catch (e) {
            uc_selector.appendChild(newOption);
        }
    }
}

function addRow(tableID) {

    var table = document.getElementById(tableID);

    var rowCount = table.rows.length;
    var row = table.insertRow(rowCount);

    var cell1 = row.insertCell(0);
    var element1 = document.createElement("input");
    element1.type = "checkbox";
    element1.name = "chkbox[]";
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

        for (var i = 0; i < rowCount; i++) {
            var row = table.rows[i];
            var chkbox = row.cells[0].childNodes[0];
            if (null !== chkbox && true === chkbox.checked) {
                table.deleteRow(i);
                rowCount--;
                i--;
            }


        }
    } catch (e) {
        alert(e);
    }
}

$(document).ready(function () {
    var max_fields = 10; //maximum input boxes allowed
    var wrapper = $(".input_fields_wrap"); //Fields wrapper
    var add_button = $(".add_field_button"); //Add button ID

    var x = 1; //initlal text box count
    $(add_button).click(function (e) { //on add input button click
        e.preventDefault();
        if (x < max_fields) { //max input box allowed
            x++; //text box increment
            $(wrapper).append('<div><input type="text" name="mytext[]"/><a href="#" class="remove_field">Remove</a></div>'); //add input box
        }
    });

    $(wrapper).on("click", ".remove_field", function (e) { //user click on remove text
        e.preventDefault();
        $(this).parent('div').remove();
        x--;
    });
});

$('.removeProfile').live('click', function (e) {
    $(this).parents('.profile').remove();
    renumber();
});

$('.removePhone').live('click', function (e) {
    var phones = $(this).parents('.phones');
    $(this).parents('.phone').remove();
    renumber(phones);
});

$('.addPhone').live('click', function (e) {
    var phones = $(this).parents('.phones');
    var template = $('.phone_template', phones);
    template.before('<div class="clearfix phone">' + template.html() + '</div>');
    renumber(phones);
});

$('.addProfile').live('click', function (e) {
    var template = $('.profile_template');
    template.before('<div class="twipsies well profile">' + template.html() + '</div>');
    renumber();
});

$('#form').submit(function () {
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

var renumber = function (phones) {
    $('.profile').each(function (i) {
        $('input', this).each(function () {
            $(this).attr('name', $(this).attr('name').replace(/informations\[.+?\]/g, 'informations[' + i + ']'));
        });
        $('.phone input', this).each(function (i) {
            $(this).attr('name', $(this).attr('name').replace(/phones\[.+\]/g, 'phones[' + i + ']'));
        });
    });
};


