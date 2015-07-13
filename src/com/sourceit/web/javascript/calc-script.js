function calc() {
var dec1 = prompt('Calculate!: enter first decimal', '');
var action= prompt('What to do? Enter <+> or <-> or <*> or </>', '');
var dec2 = prompt('And second:', '');

if(action== '+'){
alert('Result: '+ ((+dec1) + (+dec2)));
}
if(action== '-'){
alert('Result: '+ ((+dec1) - (+dec2)));
}
if(action== '*'){
alert('Result: '+ ((+dec1) * (+dec2)));
}
if(action== '/'){
alert('Result: '+ ((+dec1) / (+dec2)));
}
}

/*
var a = document.getElementById("d").value;
alert(a);
var field1;
field1=document.getElementById("field1").value;
alert(field1);
alert('Hi');
var field2=document.getElementById("field2").value;
alert((+field1)+(+field2));
var action=document.getElementById("action").value;

var result = function result(action, field1, field2){
	if(action=="+"){
	return (+field1)+(+field2);
	}
};

var calculate=document.getElementById("calculate").value;

var result;
function print(calculate){
	calculate=innerHTML.result;
}
*/