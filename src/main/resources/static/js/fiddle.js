$(document).ready(function () {
    $('.editBtn').click(function () {
        if ($('.editField').is('[readonly]')) { //checks if it is already on readonly mode
            $('.editField').prop('readonly', false); //turns the readonly off
            $('.editBtn').html('Edit'); //Changes the text of the button
            $('.editBtn').css("background", "green"); //changes the background of the button
            $('.editBtn').css("border", "green"); //changes the border of the button
            $('.editMode').toggleClass('hide'); //hide one glyphicon
            $('.nonEditMode').addClass('hide'); //show another glyphicon
        } else { //else we do other things
            $('.editField').prop('readonly', true);
            $('.editBtn').html('Edit');
            $('.editBtn').css("background", "red");
            $('.editMode').toggleClass('hide');
            $('.nonEditMode').removeClass('hide');
        }
    });

});

$(document).ready(function () {
    $('.editBtn1').click(function () {
        if ($('.editField1').is('[readonly]')) { //checks if it is already on readonly mode
            $('.editField1').prop('readonly', false); //turns the readonly off
            $('.editBtn1').html('Edit'); //Changes the text of the button
            $('.editBtn1').css("background", "green"); //changes the background of the button
            $('.editBtn1').css("border", "green"); //changes the border of the button
            $('.editMode1').toggleClass('hide'); //hide one glyphicon
            $('.nonEditMode').addClass('hide'); //show another glyphicon
        } else { //else we do other things
            $('.editField1').prop('readonly', true);
            $('.editBtn1').html('Edit');
            $('.editBtn1').css("background", "red");
            $('.editMode1').toggleClass('hide');
            $('.nonEditMode1').removeClass('hide');
        }
    });

});

$(document).ready(function () {
    $('.editBtn2').click(function () {
        if ($('.editField2').is('[readonly]')) { //checks if it is already on readonly mode
            $('.editField2').prop('readonly', false); //turns the readonly off
            $('.editBtn2').html('Edit'); //Changes the text of the button
            $('.editBtn2').css("background", "green"); //changes the background of the button
            $('.editBtn2').css("border", "green"); //changes the border of the button
            $('.editMode2').toggleClass('hide'); //hide one glyphicon
            $('.nonEditMode').addClass('hide'); //show another glyphicon
        } else { //else we do other things
            $('.editField2').prop('readonly', true);
            $('.editBtn2').html('Edit');
            $('.editBtn2').css("background", "red");
            $('.editMode2').toggleClass('hide');
            $('.nonEditMode2').removeClass('hide');
        }
    });

});

$(document).ready(function () {
    $('.editBtn3').click(function () {
        if ($('.editField3').is('[readonly]')) { //checks if it is already on readonly mode
            $('.editField3').prop('readonly', false); //turns the readonly off
            $('.editBtn3').html('Edit'); //Changes the text of the button
            $('.editBtn3').css("background", "green"); //changes the background of the button
            $('.editBtn3').css("border", "green"); //changes the border of the button
            $('.editMode3').toggleClass('hide'); //hide one glyphicon
            $('.nonEditMode').addClass('hide'); //show another glyphicon
        } else { //else we do other things
            $('.editField3').prop('readonly', true);
            $('.editBtn3').html('Edit');
            $('.editBtn3').css("background", "red");
            $('.editMode3').toggleClass('hide');
            $('.nonEditMode3').removeClass('hide');
        }
    });

});