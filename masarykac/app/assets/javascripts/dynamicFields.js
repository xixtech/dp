/**
 * Created by Martin on 19.03.2017.
 */
var pocitadlo = 1;
var pocitadlo1 = 0;
var pocitadloPublicationParticipant = 1;
var pocitadloVisitParticipant = 1;
var pocitadloProjectParticipant = 1;
var pocitadloCommitteeParticipant = 1;
var countStudyPlan = 1;
var weeksCount = 101;
var weeksTeacher = 1;
var emplArray = {};
var publParticipantArray = {};
var projectParticipantArray = {};
var committeeParticipantArray = {};
var fieldsOfStudyArray = {};
var semestersArray = {};
var studyGroupsArray = {};
var studyGroups1Array = {};
var visitParticipantArray = {};
var teachersScaleGeneral = [];
var teachersScaleGeneralLastIndex = 0;
var weeksUsedGeneral = [];
var weeksUsedGeneralLastIndex = 0;
var sDate = new Date();
var eDate = new Date();
var currDate = new Date();
var weekStart = 1;

$('body').on('click', 'input.deleteDep', function () {
    $(this).parents('tr').remove();
});

$(".showhr").click(function () {
    $(this).closest('tr').nextUntil("tr:has(.showhr)").toggle("slow", function () {
    });
});

function export2Word(element, surname, name) {
    var html, link, blob, url, css;
    css = (
        '<style>' +
        '@page WordSection1{size: 841.95pt 595.35pt;size: portrait;}' +
        'div.WordSection1 {page: WordSection1;}' +
        'table{border-collapse:collapse;}td{border:1px gray solid;width:5em;padding:2px;}' +
        '</style>'
    );
    var filename = surname + "" + name;
    html = element.innerHTML;
    blob = new Blob(['\ufeff', css + html], {
        type: 'application/msword'
    });
    url = URL.createObjectURL(blob);
    link = document.createElement('A');
    link.href = url;
    link.download = filename;  // default name without extension
    document.body.appendChild(link);
    if (navigator.msSaveOrOpenBlob) navigator.msSaveOrOpenBlob(blob, 'Document.doc'); // IE10-11
    else link.click();  // other browsers
    document.body.removeChild(link);
}

function setStartWeek() {
    var b = document.getElementById('startSemester').value.split('-');
    currDate = new Date(b[0], b[1] - 1, b[2]);

    calcDate = new Date(currDate);
    calcDate.setHours(0, 0, 0, 0);
    // Set to nearest Thursday: current date + 4 - current day number
    // Make Sunday's day number 7
    calcDate.setDate(calcDate.getDate() + 4 - (calcDate.getDay() || 7));
    // Get first day of year
    var yearStart = new Date(calcDate.getFullYear(), 0, 1);
    // Calculate full weeks to nearest Thursday
    weekStart = Math.ceil(( ( (calcDate - yearStart) / 86400000) + 1) / 7);
    calculateFirstAndLastDateOfWeek(currDate);
}

function setDateForCalculation(date) {
    currDate = new Date(date.getFullYear(), (date.getMonth()), date.getDate() + 7);
}
function calculateFirstAndLastDateOfWeek(mydate) {
    var day1 = mydate.getDay();
    sDate = new Date(mydate.getFullYear(), mydate.getMonth(), mydate.getDate() + (day1 === 0 ? -6 : 1) - day1);

    var day = mydate.getDay();
    eDate = new Date(mydate.getFullYear(), mydate.getMonth(), mydate.getDate() + (day === 0 ? 0 : 7) - day);
}

function del(elem) {
    document.getElementById(elem).remove();
}
function delGeneralTeacher(elem) {
    var pole = [];
    var teachindex = 0;
    pole.length = 0;
    var p = 0;

    for (var i = 0; i < teachersScaleGeneral.length; i++) {
        if (teachersScaleGeneral[i] == elem) {
            p = i;
        } else {
            pole[teachindex] = teachersScaleGeneral[i];
            teachindex++;
        }
    }
    teachersScaleGeneralLastIndex = teachindex;
    teachersScaleGeneral.length = 0;
    teachersScaleGeneral = pole;
    document.getElementById(elem).remove();
}
function delWeekUsed(elem) {
    var pole = [];
    var weekindex = 0;
    pole.length = 0;
    var p = 0;

    for (var i = 0; i < weeksUsedGeneral.length; i++) {
        if (weeksUsedGeneral [i] == elem) {
            p = i;
        } else {
            pole[weekindex] = weeksUsedGeneral [i];
            weekindex++;
        }
    }
    weeksUsedGeneralLastIndex = weekindex;
    weeksUsedGeneral.length = 0;
    weeksUsedGeneral = pole;
    document.getElementById(elem).remove();
}

function projectArray(projectPart) {
    projectParticipantArray = {};
    projectParticipantArray = projectPart;
}

function visitArray(visitPart) {
    visitParticipantArray = {};
    visitParticipantArray = visitPart;
}

function publicationArray(publPart) {
    publParticipantArray = {};
    publParticipantArray = publPart;
}

function committeeArray(committeePart) {
    committeeParticipantArray = {};
    committeeParticipantArray = committeePart;
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

function appendRowDivByDefault() {
    var startDate = new Date(document.getElementById('startSemester').value);
    var endDate = new Date(document.getElementById('endSemester').value);
    var weekDiff = Math.floor((endDate - startDate + 1) / (1000 * 60 * 60 * 24) / 7);
    document.getElementById('MyEdit').innerHTML = "Počet týdnů výuky: " + weekDiff;
    var radios = document.getElementsByName('optionsRadios');
    var value = 0;
    for (var i = 0, length = radios.length; i < length; i++) {
        if (radios[i].checked) {
            // do whatever you want with the checked radio
            value = radios[i].value;
            // only one radio can be logically checked, don't check the rest
            break;
        }
    }
    var count = 0;
    var num = 0;
    if (value == 1) {
        count = 14;
        num = 1;
    }
    if (value == 2) {
        count = 14 / 2;
        num = 2;
    }
    if (value == 3) {
        count = 14 / 2;
        num = 1;
    }
    if (value == 4) {
        count = document.getElementById('numOfRows').value;
        num = 1;

    }
    var current = startDate;
    for (i = 101; i < weeksCount; i++) {
        var newDiv = document.getElementById(i);

        var selectHTML = "";
        selectHTML = "<div class='row'><div class='col-md-10'>";
        selectHTML += "<div class='col-md-2'><input type='button' class='btn btn' value='Přidat vyučující' onclick='addCourseTeacherWeeksByDefault(" + i + ");'/> </div>";
        selectHTML += "<div class='col-md-1'><input type='button' class='deleteDep' value='Smazat' onclick='del(" + i + ");'/></div>";
        selectHTML += "</div></div></br>";
        newDiv.innerHTML = selectHTML;
        document.getElementById('r').appendChild(newDiv);

        if (value == 1) {
            num = num + 1;
        }
        if (value == 2) {
            num = num + 2;
        }
        if (value == 3) {
            num = num + 2;
        }

        if (value == 4) {
            num = num + 1;
        }
    }
}

function addCourseTeacherWeeksByDefault() {
    for (j = 101; j < weeksCount; j++) {
        for (o = 0; o < teachersScaleGeneral.length; o++) {
            var newDiv = document.createElement('div');
            newDiv.setAttribute("id", weeksTeacher);
            var ident = j + "" + weeksTeacher;
            newDiv.setAttribute("id", ident);
            var mapKey = emplArray.k;
            var mapValue = emplArray.v;
            var testKey = mapKey.split(";");
            var testValue = mapValue.split(";");

            var i, out = [];//literal new array
            for (i = 0; i < testKey.length; i++) {
                out.push([testKey[i], testValue[i]]);
            }

            var selectHTML = "";
            selectHTML = "<div class='row'><div class='col-md-3'><select class='form-control' id='tname" + j + "" + weeksTeacher + "' name='tname" + j + "" + weeksTeacher + "'>";
            for (i = 0; i < out.length; i = i + 1) {
                selectHTML += "<option value='" + out[i][0] + "'>" + out[i][1] + "</option>";
            }
            selectHTML += "</select></div><div class='col-md-1'><input type='text' class='form-control' id='tvalue" + j + "" + weeksTeacher + "' name='tvalue" + j + "" + weeksTeacher + "' onkeyup='handleChange(this);' onkeypress='return isDecimalNumberKey(event)' required></div><div class='col-md-1'><label>%</label></div><div class='col-md-1'><input type='button' class='btn btn-outline btn-danger' value='Smazat' onclick='delWeekUsed(" + ident + ");'/></div></div> </br>";
            newDiv.innerHTML = selectHTML;

            document.getElementById(j).appendChild(newDiv);
            document.getElementById('tname' + j + "" + weeksTeacher).value = document.getElementById('tc' + teachersScaleGeneral[o]).value;
            document.getElementById('tvalue' + j + "" + weeksTeacher).value = document.getElementById('vc' + teachersScaleGeneral[o]).value;

            weeksTeacher++;
        }
    }
    document.getElementById('addToAllWeeks').style.visibility = 'hidden';
    document.getElementById('addCourseT').style.visibility = 'hidden';
}

function appendRowDiv() {
    var startDate = new Date(document.getElementById('startSemester').value);
    var endDate = new Date(document.getElementById('endSemester').value);
    var weekDiff = Math.floor((endDate - startDate + 1) / (1000 * 60 * 60 * 24) / 7);
    document.getElementById('MyEdit').innerHTML = "Počet týdnů výuky: " + weekDiff;
    var radios = document.getElementsByName('optionsRadios');
    var value = 0;
    for (var i = 0, length = radios.length; i < length; i++) {
        if (radios[i].checked) {
            // do whatever you want with the checked radio
            value = radios[i].value;
            // only one radio can be logically checked, don't check the rest
            break;
        }
    }
    var count = 0;
    var num = 0;
    var year = 2017;
    if (value == 1) {
        count = weekDiff;
        num = weekStart;
    }
    if (value == 2) {
        count = weekDiff / 2;
        if (weekStart%2 === 0){
            num = weekStart;
        }
        else{
            num = weekStart+1;
        }

    }
    if (value == 3) {
        count = weekDiff / 2;
        if (weekStart%2 !== 0){

        }
        else{
            num = weekStart+1;
        }
    }
    if (value == 4) {
        count = document.getElementById('numOfRows').value;
        num = weekStart;
    }

    var current = startDate;
    for (i = 0; i < count; i++) {
        var newDiv = document.createElement('div');
        newDiv.setAttribute("id", weeksCount);

        if (num > 52) {
            num = 1;
            if (value == 2) {
                num = 2;
            }
            year++;
        }

        var selectHTML = "";
        selectHTML = "<div class='row'><div class='col-md-10'>";
        selectHTML += "<div class='col-md-2'><input type='button' class='btn btn' value='Přidat vyučující' onclick='addCourseTeacherWeeks(" + weeksCount + ");'/> </div>";
        selectHTML += "<div class='col-md-2'><input type='text' class='form-control' name='scheduleWeek" + weeksCount + "' value='" + num + "' onkeypress='return isNumberKey(event)' required/></div>";
        selectHTML += "<div class='col-md-2'><input type='text' class='form-control' name='scheduleYear" + weeksCount + "' value='" + year + "' onkeypress='return isNumberKey(event)' required/></div>";
        selectHTML += "<div class='col-md-1'><input type='button' class='deleteDep' value='Smazat' onclick='del(" + weeksCount + ");'/></div>";
        selectHTML += "</div></div>";
        selectHTML += "<div class='row'><div class='col-md-10'>";
        selectHTML += "  <label>" + 'Týden od: ' + sDate.getDate() + '. ' + (sDate.getMonth() + 1) + '. ' + sDate.getFullYear() + ' do: ' + eDate.getDate() + '. ' + (eDate.getMonth() + 1) + '. ' + eDate.getFullYear() + " </label>";
        selectHTML += "</div></div></br>";
        newDiv.innerHTML = selectHTML;
        document.getElementById('r').appendChild(newDiv);
        weeksCount++;

        setDateForCalculation(currDate);
        calculateFirstAndLastDateOfWeek(currDate);
        if (value == 1) {
            num = num + 1;
        }
        if (value == 2) {
            num = num + 2;
        }
        if (value == 3) {
            num = num + 2;
        }

        if (value == 4) {
            num = num + 1;
        }
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
    selectHTML = "<input type='text' class='form-control' name='scheduleWeek' value='" + text + "' onkeypress='return isNumberKey(event)' required>";
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
    selectHTML = "<input type='text' class='form-control' name='scheduleYear' value='" + text + "' onkeypress='return isNumberKey(event)' required>";
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

function addPublicationParticipant() {

    var newDiv = document.createElement('div');
    var idnt = pocitadloPublicationParticipant;
    newDiv.setAttribute("id", idnt);
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
    selectHTML += "</select></div><div class='col-md-2'><input type='text' class='form-control' placeholder='Fakulta' name='faculty' required> </div>";
    selectHTML += "<div class='col-md-2'><input type='text' class='form-control' onkeyup='handleChange(this);' onkeypress='return isNumberKey(event)' placeholder='Pořadí' name='orderInPublication' required> </div>";
    selectHTML += "<div class='col-md-3'><input type='text' class='form-control' placeholder='Oddělení' name='department' required> </div>";
    selectHTML += "<div class='col-md-1'><input type='text' class='form-control' name='share' placeholder='Podíl' onkeyup='handleChange(this);' onkeypress='return isDecimalNumberKey(event)' required></div><div class='col-md-1'><input type='button' class='deleteDep' value='Smazat' onclick='del(" + idnt + ");'/></div></div></br>";
    newDiv.innerHTML = selectHTML;
    document.getElementById('publpart').appendChild(newDiv);
    pocitadloPublicationParticipant++;
}

function addVisitParticipant() {

    var newDiv = document.createElement('div');
    var idnt = pocitadloVisitParticipant;
    newDiv.setAttribute("id", idnt);
    var mapKey = visitParticipantArray.k;
    var mapValue = visitParticipantArray.v;
    var testKey = mapKey.split(";");
    var testValue = mapValue.split(";");

    var i, out = [];//literal new array
    for (i = 0; i < testKey.length; i++) {
        out.push([testKey[i], testValue[i]]);
    }

    var selectHTML = "";
    selectHTML = "<div class='row'><div class='col-md-5'><select class='form-control' name='employees.id'>";
    for (i = 0; i < out.length; i = i + 1) {
        selectHTML += "<option value='" + out[i][0] + "'>" + out[i][1] + "</option>";

    }
    selectHTML += "</select></div>";
    selectHTML += "<div class='col-md-1'><input type='button' class='deleteDep' value='Smazat' onclick='del(" + idnt + ");'/></div></div></br>";
    newDiv.innerHTML = selectHTML;
    document.getElementById('visitpart').appendChild(newDiv);
    pocitadloVisitParticipant++;
}

function addProjectParticipant() {

    var newDiv = document.createElement('div');
    var idnt = pocitadloProjectParticipant;
    newDiv.setAttribute("id", idnt);
    var mapKey = projectParticipantArray.k;
    var mapValue = projectParticipantArray.v;
    var testKey = mapKey.split(";");
    var testValue = mapValue.split(";");

    var i, out = [];//literal new array
    for (i = 0; i < testKey.length; i++) {
        out.push([testKey[i], testValue[i]]);
    }

    var selectHTML = "";
    selectHTML = "<div class='row'><div class='col-md-5'><select class='form-control' name='employees.id'>";
    for (i = 0; i < out.length; i = i + 1) {
        selectHTML += "<option value='" + out[i][0] + "'>" + out[i][1] + "</option>";

    }
    selectHTML += "</select></div>";
    selectHTML += "<div class='col-md-3'><input type='text' class='form-control' placeholder='Role v projektu' name='projectRole' required> </div>";
    selectHTML += "<div class='col-md-1'><input type='button' class='deleteDep' value='Smazat' onclick='del(" + idnt + ");'/></div></div></br>";
    newDiv.innerHTML = selectHTML;
    document.getElementById('projectpart').appendChild(newDiv);
    pocitadloProjectParticipant++;
}


function addCommitteeParticipant() {
    var newDiv = document.createElement('div');
    var idCommittee = pocitadloCommitteeParticipant;
    newDiv.setAttribute("id", idCommittee);
    var mapKey = committeeParticipantArray.k;
    var mapValue = committeeParticipantArray.v;
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
    selectHTML += "</select></div><div class='col-md-3'><input type='text' class='form-control' placeholder='Pozice v komisi' name='roleInCommittee' required> </div>";
    selectHTML += "<div class='col-md-1'><input type='button' class='deleteDep' value='Smazat' onclick='del(" + idCommittee + ");'/></div></div></br>";
    newDiv.innerHTML = selectHTML;
    document.getElementById('committeepart').appendChild(newDiv);
    pocitadloCommitteeParticipant++;
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
    selectHTML += "</select></div><div class='col-md-2'><input type='text' class='form-control' name='semesterValue' onkeyup='sv(this);' onkeypress='return isNumberKey(event)' required> </div>";
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
    selectHTML += "</select></div><div class='col-md-3'><input type='text' class='form-control' name='faculty' required> </div>";
    selectHTML += "<div class='col-md-1'><input type='text' class='form-control' onkeyup='handleChange(this);' onkeypress='return isDecimalNumberKey(event)' name='orderInPublication' required> </div>";
    selectHTML += "<div class='col-md-3'><input type='text' class='form-control' name='department' required> </div>";
    selectHTML += "<div class='col-md-1'><input type='text' class='form-control' name='share' onkeypress='return isDecimalNumberKey(event)' required> </div>";
    selectHTML += "<div class='col-md-1'><input type='button' class='btn btn' value='Smazat' onclick='del(" + ident + ");'/></div></div></br>";
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
    selectHTML += "</select></div><div class='col-md-4'><input type='text' class='form-control' name='teachers.scale' onkeyup='handleChange(this);' onkeypress='return isDecimalNumberKey(event)' required></div><div class='col-md-2'><input type='button' class='btn btn' value='Př' onclick='addPokusRadek(" + pocitadlo + ");'/>  </div></div></br>";
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
    selectHTML = "<div class='row'><div class='col-md-5'><select class='form-control' id='tc" + pocitadlo + "' name='teachers.id'>";
    for (i = 0; i < out.length; i = i + 1) {
        selectHTML += "<option value='" + out[i][0] + "'>" + out[i][1] + "</option>";

    }
    selectHTML += "</select></div><div class='col-md-2'><input type='text' class='form-control' id='vc" + pocitadlo + "' name='teachers.scale' onkeyup='handleChange(this);' onkeypress='return isDecimalNumberKey(event)' required></div><div class='col-md-1'><input type='button' class='deleteDep' value='Smazat' onclick='delGeneralTeacher(" + pocitadlo + ");'/></div></div> </br>";
    newDiv.innerHTML = selectHTML;
    document.getElementById('radky').appendChild(newDiv);
    document.getElementById('addToAllWeeks').style.visibility = 'visible';
    teachersScaleGeneral[teachersScaleGeneralLastIndex] = pocitadlo;
    teachersScaleGeneralLastIndex++;
    pocitadlo++;
}

function addCourseTeacherWeeks(divName) {

    var newDiv = document.createElement('div');
    newDiv.setAttribute("id", weeksTeacher);
    var ident = divName + "" + weeksTeacher;
    newDiv.setAttribute("id", ident);
    var mapKey = emplArray.k;
    var mapValue = emplArray.v;
    var testKey = mapKey.split(";");
    var testValue = mapValue.split(";");

    var i, out = [];//literal new array
    for (i = 0; i < testKey.length; i++) {
        out.push([testKey[i], testValue[i]]);
    }

    var selectHTML = "";
    selectHTML = "<div class='row'><div class='col-md-3'><select class='form-control' id='tname" + divName + "" + weeksTeacher + "' name='tname" + divName + "" + weeksTeacher + "'>";
    for (i = 0; i < out.length; i = i + 1) {
        selectHTML += "<option value='" + out[i][0] + "'>" + out[i][1] + "</option>";
    }
    selectHTML += "</select></div><div class='col-md-1'><input type='text' class='form-control' name='tvalue" + divName + "" + weeksTeacher + "' onkeyup='handleChange(this);' onkeypress='return isDecimalNumberKey(event)' required></div><div class='col-md-1'><label>%</label></div><div class='col-md-1'><input type='button' class='btn btn-outline btn-danger' value='Smazat' onclick='del(" + ident + ");'/></div></div> </br>";
    newDiv.innerHTML = selectHTML;
    document.getElementById(divName).appendChild(newDiv);

    weeksTeacher++;
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
    selectHTML += "</select></div><div class='col-md-6'><input type='text' class='form-control' onkeyup='handleChange(this);' onkeypress='return isDecimalNumberKey(event)' name='teachers.scale'> </div></div></br>";
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
    selectHTML += "</select></div><div class='col-md-6'><input type='text' class='form-control' name='values[]' onkeyup='handleChange(this);'> </div></div></br>";
    newDiv.innerHTML = selectHTML;
    document.getElementById(divName).appendChild(newDiv);
}
function isNumberKey(evt) {
    var charCode = (evt.which) ? evt.which : event.keyCode;
    if (charCode > 31 && ((charCode < 48 || charCode > 57)))
        return false;
    return true;
}

function isDateKey(evt) {
    var charCode = (evt.which) ? evt.which : event.keyCode;
    if (charCode > 31 && ((charCode < 48 || charCode > 58)))
        return false;
    return true;
}

function isDecimalNumberKey(evt) {
    var charCode = (evt.which) ? evt.which : event.keyCode;
    if (!((charCode > 47 && charCode <= 57) || ( charCode == 8) || (charCode == 44) || ( charCode == 46) || ( charCode === 0) || (charCode == 127)))
        return false;
    return true;
}

function handleChange(input) {
    if (input.value < 0) input.value = 0;
    if (input.value > 100) input.value = 100;
}

function sv(input) {
    if (input.value < 0) input.value = 0;
    if (input.value > 6) input.value = 6;
}

function displaySubjectTextArea() {
    if (document.getElementById('subjOption2').checked) {
        document.getElementById('okSubject').style.display = 'block';
    }
}

function displaySubjectTextAreaOff() {
    if (document.getElementById('subjOption1').checked) {
        document.getElementById('okSubject').style.display = 'none';
    }
}

function displayPublicationTextArea() {
    if (document.getElementById('publOption2').checked) {
        document.getElementById('okPublication').style.display = 'block';
    }
}

function displayPublicationTextAreaOff() {
    if (document.getElementById('publOption1').checked) {
        document.getElementById('okPublication').style.display = 'none';
    }
}

function displayProjectTextArea() {
    if (document.getElementById('projOption2').checked) {
        document.getElementById('okProject').style.display = 'block';
    }
}

function displayProjectTextAreaOff() {
    if (document.getElementById('projOption1').checked) {
        document.getElementById('okProject').style.display = 'none';
    }
}

function displayCommitteeTextArea() {
    if (document.getElementById('committeeOption2').checked) {
        document.getElementById('okCommittee').style.display = 'block';
    }
}

function displayCommitteeTextAreaOff() {
    if (document.getElementById('committeeOption1').checked) {
        document.getElementById('okCommittee').style.display = 'none';
    }
}

function displayFinalTextArea() {
    if (document.getElementById('finalOption2').checked) {
        document.getElementById('okFinal').style.display = 'block';
    }
}

function displayFinalTextAreaOff() {
    if (document.getElementById('finalOption1').checked) {
        document.getElementById('okFinal').style.display = 'none';
    }
}

function displayVisitTextArea() {
    if (document.getElementById('visitOption2').checked) {
        document.getElementById('okVisit').style.display = 'block';
    }
}

function displayVisitTextAreaOff() {
    if (document.getElementById('visitOption1').checked) {
        document.getElementById('okVisit').style.display = 'none';
    }
}

function displaySpecialWeeks() {
    if (document.getElementById('yesCheck').checked) {
        document.getElementById('ifYes').style.display = 'block';
    }
    else document.getElementById('ifYes').style.display = 'none';
}




