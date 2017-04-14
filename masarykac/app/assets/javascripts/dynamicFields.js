/**
 * Created by Martin on 19.03.2017.
 */
var counter = 1;
var hodnotaValue = 0;
var hodnotaKey;
var pocitadlo = 1;
var pocitadlo1 = 0;
var countStudyPlan = 1;
var countEmployees = 1;
var ob = {};
var ob1 = {};
var emplArray = {};
var publParticipantArray = {};
var fieldsOfStudyArray = {};
var semestersArray = {};
var studyGroupsArray = {};
var studyGroups1Array = {};
var cuisines = ["Chinese", "Indian"];
var choices = [["one", "1"], ["two", "2"]];

$('body').on('click', 'input.deleteDep', function () {
    $(this).parents('tr').remove();
});

$(".showhr").click(function () {
    $(this).closest('tr').nextUntil("tr:has(.showhr)").toggle("slow", function () {
    });
});

function hokuspokus() {
    var div = document.createElement('div');
    div.setAttribute('class', 'someClass');
    div.innerHTML = document.getElementById('blockOfStuff').innerHTML;
    document.getElementById(pocitadlo).appendChild(div);
    pocitadlo++;
    document.getElementById(pocitadlo - 1).setAttribute("id", pocitadlo);

    var div1 = document.createElement('div');
    div1.setAttribute('class', 'someClass');
    div1.innerHTML = document.getElementById('blockOfStuff1').innerHTML;
    document.getElementById('ooo').appendChild(div1);


}

function del(elem) {
    document.getElementById(elem).remove();

}

function hokuspokusCislo(o) {
    ob = {};
    ob = o;
}
function hokuspokusCislo1(o) {
    ob1 = {};
    ob1 = o;
}

function publicationArray(publPart) {
    publParticipantArray = {};
    publParticipantArray = publPart;
}

function employeeArray(empl) {
    emplArray = {};
    emplArray = empl;
}
function studyplansArrays(fields, sem, stud, stud1) {
    fieldsOfStudyArray = {};
    semestersArray = {};
    studyGroupsArray = {};
    studyGroups1Array = {};

    fieldsOfStudyArray = fields;
    semestersArray = sem;
    studyGroupsArray = stud;
    studyGroups1Array = stud1;
}


function appendRow() {

    for (i = 0; i < 14; i++) {
        var tbl = document.getElementById('my-table'), // table reference
            row = tbl.insertRow(tbl.rows.length);


        createCellscheduleWeek(row.insertCell(0), i + 1, 'row');
        createCellscheduleYear(row.insertCell(1), 2017, 'row');
        createCellDeleteButton(row.insertCell(2), 2017, 'row');


    }
}

function appendRowOne() {

    for (i = 0; i < 1; i++) {
        var tbl = document.getElementById('my-table'), // table reference
            row = tbl.insertRow(tbl.rows.length),      // append table row
            j;
        createCellscheduleWeek(row.insertCell(0), i + 1, 'row');
        createCellscheduleYear(row.insertCell(1), 2017, 'row');
        createCellDeleteButton(row.insertCell(2), 2017, 'row');

    }
}
function createCellTButton() {
    var div = document.createElement('tr'); // create DIV element
    div.setAttribute('class', 'aser');
    var selectHTML = "";
    selectHTML = " <td colspan='4'></td>";
    div.innerHTML = selectHTML;
    // append text node to the DIV

}

function createCellAddButton(cell, text, style) {
    var div = document.createElement('tr'), // create DIV element
        txt = document.createTextNode(text); // create text node
    var selectHTML = "";
    selectHTML = "<input type='button' id='addB' value='Přidat' class='showhr'/>";
    div.innerHTML = selectHTML;
    // append text node to the DIV
    // set DIV class attribute
    div.setAttribute('className', style);    // set DIV class attribute for IE (?!)
    cell.appendChild(div);                   // append DIV to the table cell
}
function createCellscheduleWeek(cell, text, style) {
    var div = document.createElement('tr'), // create DIV element
        txt = document.createTextNode(text); // create text node
    var selectHTML = "";
    selectHTML = "<input type='text' class='form-control' name='scheduleWeek' value='" + text + "'>";
    div.innerHTML = selectHTML;
    // append text node to the DIV
    // set DIV class attribute
    div.setAttribute('className', style);    // set DIV class attribute for IE (?!)
    cell.appendChild(div);                   // append DIV to the table cell
}

function createCellscheduleYear(cell, text, style) {
    var div = document.createElement('tr'), // create DIV element
        txt = document.createTextNode(text); // create text node
    var selectHTML = "";
    selectHTML = "<input type='text' class='form-control' name='scheduleYear' value='" + text + "'>";
    div.innerHTML = selectHTML;
    // append text node to the DIV
    // set DIV class attribute
    div.setAttribute('className', style);    // set DIV class attribute for IE (?!)
    cell.appendChild(div);                   // append DIV to the table cell
}
function createCellDeleteButton(cell, text, style) {
    var div = document.createElement('tr'), // create DIV element
        txt = document.createTextNode(text); // create text node
    var selectHTML = "";
    selectHTML = " <input type='button' id='delPOIbutton' value='Smazat' class='deleteDep'/>";
    div.innerHTML = selectHTML;
    // append text node to the DIV
    div.setAttribute('class', style);        // set DIV class attribute
    div.setAttribute('className', style);    // set DIV class attribute for IE (?!)
    cell.appendChild(div);                   // append DIV to the table cell
}

function addPublicationParticipant(divName) {

    var newDiv = document.createElement('div');
    var mapKey = publParticipantArray.k;
    var mapValue = publParticipantArray.v;
    var testKey = mapKey.split(";");
    var testValue = mapValue.split(";");

    var i, out = [];//literal new array
    for (i = 0; i < testKey.length; i++) {
        out.push([testKey[i], testValue[i]]);
    }

    var selectHTML = "";
    selectHTML = "<div class='row'><div class='col-md-4'><select class='form-control' name='employees.id'>";
    for (i = 0; i < out.length; i = i + 1) {
        selectHTML += "<option value='" + out[i][0] + "'>" + out[i][1] + "</option>";

    }
    selectHTML += "</select></div><div class='col-md-3'><input type='text' class='form-control' name='faculty'> </div>";
    selectHTML += "<div class='col-md-1'><input type='text' class='form-control' onkeypress='return isNumberKey(event)' name='orderInPublication'> </div>";
    selectHTML += "<div class='col-md-3'><input type='text' class='form-control' name='department'> </div>";
    selectHTML += "<div class='col-md-1'><input type='text' class='form-control' name='share'> </div></div></br>";
    newDiv.innerHTML = selectHTML;
    document.getElementById(divName).appendChild(newDiv);
}

function addStudyPlan(divName) {

    var newDiv = document.createElement('div');
    var idn = countStudyPlan;
    newDiv.setAttribute("id", idn);
    var mapKeyfieldsOfStudy = fieldsOfStudyArray.k;
    var mapValuefieldsOfStudy = fieldsOfStudyArray.v;
    var testKeyfieldsOfStudy = mapKeyfieldsOfStudy.split(";");
    var testValuefieldsOfStudy = mapValuefieldsOfStudy.split(";");

    var mapKeysemesters = semestersArray.k;
    var mapValuesemesters = semestersArray.v;
    var testKeysemesters = mapKeysemesters.split(";");
    var testValuesemesters = mapValuesemesters.split(";");

    var mapKeystudyGroups = studyGroupsArray.k;
    var mapValuestudyGroups = studyGroupsArray.v;
    var testKeystudyGroups = mapKeystudyGroups.split(";");
    var testValuestudyGroups = mapValuestudyGroups.split(";");

    var mapKeystudyGroups1 = studyGroups1Array.k;
    var mapValuestudyGroups1 = studyGroups1Array.v;
    var testKeystudyGroups1 = mapKeystudyGroups1.split(";");
    var testValuestudyGroups1 = mapValuestudyGroups1.split(";");

    var i, outfieldsOfStudy = [];//literal new array
    for (i = 0; i < testKeyfieldsOfStudy.length; i++) {
        outfieldsOfStudy.push([testKeyfieldsOfStudy[i], testValuefieldsOfStudy[i]]);
    }

    var outsemesters = [];//literal new array
    for (i = 0; i < testKeysemesters.length; i++) {
        outsemesters.push([testKeysemesters[i], testValuesemesters[i]]);
    }

    var outstudyGroups = [];//literal new array
    for (i = 0; i < testKeystudyGroups.length; i++) {
        outstudyGroups.push([testKeystudyGroups[i], testValuestudyGroups[i]]);
    }

    var outstudyGroups1 = [];//literal new array
    for (i = 0; i < testKeystudyGroups1.length; i++) {
        outstudyGroups1.push([testKeystudyGroups1[i], testValuestudyGroups1[i]]);
    }

    var selectHTML = "";
    selectHTML = "<div class='row'><div class='col-md-2'><select class='form-control' name='fieldsOfStudy.id'>";
    for (i = 0; i < outfieldsOfStudy.length; i = i + 1) {
        selectHTML += "<option value='" + outfieldsOfStudy[i][0] + "'>" + outfieldsOfStudy[i][1] + "</option>";

    }
    selectHTML += "</select></div>";
    selectHTML += "<div class='col-md-2'><select class='form-control' name='semesters.id'>";
    for (i = 0; i < outsemesters.length; i = i + 1) {
        selectHTML += "<option value='" + outsemesters[i][0] + "'>" + outsemesters[i][1] + "</option>";

    }
    selectHTML += "</select></div><div class='col-md-2'><input type='text' class='form-control' name='semesterValue'> </div>";
    selectHTML += "<div class='col-md-2'><select class='form-control' name='studyGroups.id'>";
    for (i = 0; i < outstudyGroups.length; i = i + 1) {
        selectHTML += "<option value='" + outstudyGroups[i][0] + "'>" + outstudyGroups[i][1] + "</option>";

    }
    selectHTML += "</select></div>";
    selectHTML += "<div class='col-md-2'><select class='form-control' name='studyGroups1.id'>";
    for (i = 0; i < outstudyGroups1.length; i = i + 1) {
        selectHTML += "<option value='" + outstudyGroups1[i][0] + "'>" + outstudyGroups1[i][1] + "</option>";

    }
    selectHTML += "</select></div>";
    selectHTML += "<div class='col-md-1'><input type='button' class='deleteDep' value='Smazat' onclick='del(" + idn + ");'/></div></div></br>";
    newDiv.innerHTML = selectHTML;
    document.getElementById(divName).appendChild(newDiv);
    countStudyPlan++;
}

function addPokusRadek(divName) {

    var newDiv = document.createElement('div');
    var ident = divName + "" + pocitadlo1;
    newDiv.setAttribute("id", ident);
    var mapKey = publParticipantArray.k;
    var mapValue = publParticipantArray.v;
    var testKey = mapKey.split(";");
    var testValue = mapValue.split(";");

    var i, out = [];//literal new array
    for (i = 0; i < testKey.length; i++) {
        out.push([testKey[i], testValue[i]]);
    }

    var selectHTML = "";
    selectHTML = "<div class='row'><div class='col-md-3'><select class='form-control' name='employees.id'>";
    for (i = 0; i < out.length; i = i + 1) {
        selectHTML += "<option value='" + out[i][0] + "'>" + out[i][1] + "</option>";

    }
    selectHTML += "</select></div><div class='col-md-3'><input type='text' class='form-control' name='faculty'> </div>";
    selectHTML += "<div class='col-md-1'><input type='text' class='form-control' onkeypress='return isNumberKey(event)' name='orderInPublication'> </div>";
    selectHTML += "<div class='col-md-3'><input type='text' class='form-control' name='department'> </div>";
    selectHTML += "<div class='col-md-1'><input type='text' class='form-control' name='share'> </div>";
    selectHTML += "<div class='col-md-1'><input type='button' class='btn btn' value='D' onclick='del(" + ident + ");'/></div></div></br>";
    newDiv.innerHTML = selectHTML;
    document.getElementById(divName).appendChild(newDiv);
    pocitadlo1++;
}

function addDivToTable(cell, text, style) {
    var div = document.createElement('tr'), // create DIV element
        txt = document.createTextNode(text); // create text node
    var selectHTML = "";
    selectHTML = "<input type='button' name='' value='' data-href='xxx'/>";
    selectHTML += "<input type='button' name='' value='#'/>";

    div.innerHTML = selectHTML;
    // append text node to the DIV
    div.setAttribute('class', style);        // set DIV class attribute
    div.setAttribute('className', style);    // set DIV class attribute for IE (?!)
    cell.appendChild(div);                   // append DIV to the table cell
}

function addCourseTeacher() {

    var newDiv = document.createElement('div');
    newDiv.setAttribute("id", pocitadlo);
    var mapKey = emplArray.k;
    var mapValue = emplArray.v;
    var testKey = mapKey.split(";");
    var testValue = mapValue.split(";");
    var i, out = [];//literal new array
    for (i = 0; i < testKey.length; i++) {
        out.push([testKey[i], testValue[i]]);
    }

    var selectHTML = "";
    selectHTML = "<div class='row'><div class='col-md-6'><select class='form-control' name='teachers.id'>";
    for (i = 0; i < out.length; i = i + 1) {
        selectHTML += "<option value='" + out[i][0] + "'>" + out[i][1] + "</option>";

    }
    selectHTML += "</select></div><div class='col-md-4'><input type='text' class='form-control' name='teachers.scale'></div><div class='col-md-2'><input type='button' class='btn btn' value='Př' onclick='addPokusRadek(" + pocitadlo + ");'/>  </div></div></br>";
    newDiv.innerHTML = selectHTML;
    document.getElementById('radky').appendChild(newDiv);

    pocitadlo++;

}
function addCourseTeacher1() {

    var newDiv = document.createElement('div');
    newDiv.setAttribute("id", pocitadlo);
    var mapKey = emplArray.k;
    var mapValue = emplArray.v;
    var testKey = mapKey.split(";");
    var testValue = mapValue.split(";");

    var i, out = [];//literal new array
    for (i = 0; i < testKey.length; i++) {
        out.push([testKey[i], testValue[i]]);
    }

    var selectHTML = "";
    selectHTML = "<div class='row'><div class='col-md-6'><select class='form-control' name='teachers.id'>";
    for (i = 0; i < out.length; i = i + 1) {
        selectHTML += "<option value='" + out[i][0] + "'>" + out[i][1] + "</option>";

    }
    selectHTML += "</select></div><div class='col-md-5'><input type='text' class='form-control' name='teachers.scale'></div><div class='col-md-1'><input type='button' class='deleteDep' value='Smazat' onclick='del(" + pocitadlo + ");'/></div></div> </br>";
    newDiv.innerHTML = selectHTML;
    document.getElementById('radky').appendChild(newDiv);

    pocitadlo++;
}

function addCourseTeacherTable(divName) {

    var newDiv = document.createElement('div');
    var mapKey = document.getElementById('myFieldX').value;
    var mapValue = document.getElementById('myField2X').value;
    var testKey = mapKey.split(";");
    var testValue = mapValue.split(";");

    var i, out = [];//literal new array
    for (i = 0; i < testKey.length; i++) {
        out.push([testKey[i], testValue[i]]);
    }

    var selectHTML = "";
    selectHTML = "<div class='row'><div class='col-md-6'><select class='form-control' name='teachers.id'>";
    for (i = 0; i < out.length; i = i + 1) {
        selectHTML += "<option value='" + out[i][0] + "'>" + out[i][1] + "</option>";

    }
    selectHTML += "</select></div><div class='col-md-6'><input type='text' class='form-control' name='teachers.scale'> </div></div></br>";
    newDiv.innerHTML = selectHTML;
    document.getElementById(divName).appendChild(newDiv);
}


(function ($) {
    var minNumber = -100;
    var maxNumber = 100;

    $('.txtinput').on("change", function () {
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
    for (i = 0; i < testKey.length; i++) {
        out.push([testKey[i], testValue[i]]);
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
function isNumberKey(evt) {
    var charCode = (evt.which) ? evt.which : event.keyCode;
    if (charCode > 31 && (charCode != 46 && (charCode < 48 || charCode > 57)))
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




