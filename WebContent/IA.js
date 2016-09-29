/**
 * 
 */
/**
 * 
 */
	
	var array1=['active1','active2','active3','active4','active5','active6','active7','active8'];
	var array2=['arrow-right1','arrow-right2','arrow-right3','arrow-right4','arrow-right5','arrow-right6','arrow-right7','arrow-right8'];
	var array3=['first','second','third','fourth','fifth','sixth','seventh','eighth'];
function step1()
{
	for(var i=0;i<8;i++)
		{
		if(i==0)
			{
			document.getElementById(array1[i]).style.color="red";
			document.getElementById(array2[i]).style.display="block";
			document.getElementById(array3[i]).style.display="block";

			}
		else
			{
			document.getElementById(array1[i]).style.color="black";
			document.getElementById(array2[i]).style.display="none";
			document.getElementById(array3[i]).style.display="none";

			}
		
		}
	
}
function step2()
{
	for(var i=0;i<8;i++)
	{
	if(i==1)
		{
		document.getElementById(array1[i]).style.color="red";
		document.getElementById(array2[i]).style.display="block";
		document.getElementById(array3[i]).style.display="block";

		}
	else
		{
		document.getElementById(array1[i]).style.color="black";
		document.getElementById(array2[i]).style.display="none";
		document.getElementById("first").style.display="none";
		}
	
	}
}
function step3()
{
	for(var i=0;i<8;i++)
	{
	if(i==2)
		{
		document.getElementById(array1[i]).style.color="red";
		document.getElementById(array2[i]).style.display="block";
		document.getElementById(array3[i]).style.display="block";

		}
	else
		{
		document.getElementById(array1[i]).style.color="black";
		document.getElementById(array2[i]).style.display="none";
		document.getElementById(array3[i]).style.display="none";

		}
	}
	}
function step4()
{ 
	for(var i=0;i<8;i++)
	{
	if(i==3)
		{
		document.getElementById(array1[i]).style.color="red";
		document.getElementById(array2[i]).style.display="block";
		document.getElementById(array3[i]).style.display="block";

		}
	else
		{
		document.getElementById(array1[i]).style.color="black";
		document.getElementById(array2[i]).style.display="none";
		document.getElementById(array3[i]).style.display="none";
		}
	}
	}
function step5()
{
	for(var i=0;i<8;i++)
	{
	if(i==4)
		{
		document.getElementById(array1[i]).style.color="red";
		document.getElementById(array2[i]).style.display="block";
		document.getElementById(array3[i]).style.display="block";

		}
	else
		{
		document.getElementById(array1[i]).style.color="black";
		document.getElementById(array2[i]).style.display="none";
		document.getElementById(array3[i]).style.display="none";
		}
	}
}
function step6()
{
	for(var i=0;i<8;i++)
	{
	if(i==5)
		{
		document.getElementById(array1[i]).style.color="red";
		document.getElementById(array2[i]).style.display="block";
		document.getElementById(array3[i]).style.display="block";

		}
	else
		{
		document.getElementById(array1[i]).style.color="black";
		document.getElementById(array2[i]).style.display="none";
		document.getElementById(array3[i]).style.display="none";
		}
	}
}
function step7()
{
	for(var i=0;i<8;i++)
	{
	if(i==6)
		{
		document.getElementById(array1[i]).style.color="red";
		
		document.getElementById(array2[i]).style.display="block";
		document.getElementById(array3[i]).style.display="block";
		}
	else
		{
		document.getElementById(array1[i]).style.color="black";
		document.getElementById(array2[i]).style.display="none";
		document.getElementById(array3[i]).style.display="none";

		}
	
	}
	
	
}
function step8()
{
	for(var i=0;i<8;i++)
	{
	if(i==7)
		{
		document.getElementById(array1[i]).style.color="red";
		document.getElementById(array2[i]).style.display="block";
		document.getElementById(array3[i]).style.display="block";

		}
	else
		{
		document.getElementById(array1[i]).style.color="black";
		document.getElementById(array2[i]).style.display="none";
		document.getElementById(array3[i]).style.display="none";

		}
	
	}
}
function addfield1()
{
	document.getElementById("a1").style.display="none";
	document.getElementById("sub2").style.display="block";
}
function addfield2()
{
	document.getElementById("a2").style.display="none";
	document.getElementById("sub3").style.display="block";

	}
function addfield3()
{
	document.getElementById("a3").style.display="none";
	document.getElementById("sub4").style.display="block";

	}
function addfield4()
{
	document.getElementById("a4").style.display="none";
	document.getElementById("sub5").style.display="block";

	}
function addfield5()
{
	document.getElementById("a5").style.display="none";
	document.getElementById("sub6").style.display="block";

	}
function addfield6()
{
	document.getElementById("e1").style.display="none";
	document.getElementById("expsub2").style.display="block";

	}
function addfield7()
{
	document.getElementById("e2").style.display="none";
	document.getElementById("expsub3").style.display="block";

	}
function addfield8()
{
	document.getElementById("e3").style.display="none";
	document.getElementById("expsub4").style.display="block";

	}
function addfield9()
{
	document.getElementById("e4").style.display="none";
	document.getElementById("expsub5").style.display="block";

	}
function addfield10()
{
	document.getElementById("e5").style.display="none";
	document.getElementById("expsub6").style.display="block";

	}
function addfield11()
{
	document.getElementById("p1").style.display="none";
	document.getElementById("prosub2").style.display="block";

	}
function addfield12()
{
	document.getElementById("p2").style.display="none";
	document.getElementById("prosub3").style.display="block";
	}
function addfield13()
{
	document.getElementById("p3").style.display="none";
	document.getElementById("prosub4").style.display="block";
	}
function addfield14()
{
	document.getElementById("p4").style.display="none";
	document.getElementById("prosub5").style.display="block";
	}
function addfield15()
{
	document.getElementById("p5").style.display="none";
	document.getElementById("prosub6").style.display="block";
	}
function addfield16()
{
	document.getElementById("t1").style.display="none";
	document.getElementById("trainsub2").style.display="block";
	}
function addfield17()
{
	document.getElementById("t2").style.display="none";
	document.getElementById("trainsub3").style.display="block";
	}
function addfield18()
{
	document.getElementById("t3").style.display="none";
	document.getElementById("trainsub4").style.display="block";
	}
function addfield19()
{
	document.getElementById("t4").style.display="none";
	document.getElementById("trainsub5").style.display="block";
	}
function addfield20()
{
	document.getElementById("t5").style.display="none";
	document.getElementById("trainsub6").style.display="block";
	}