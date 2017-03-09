
$('#first').on('change', function () {
        $(this).val($(this).val() * 3);
        compute();
    });

$('#second').on('change', function () {
    $(this).val($(this).val() * 3);
    compute();
});

function compute() {
    var first = ~~$('#first').val();
    var second = ~~$('#second').val();
    var result = $('#result');
    var grade = first + second;
    result.val(grade);
}

