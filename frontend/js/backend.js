

function checkJoke(jokeType)
{
  
  
 
      fetch('http://localhost:8080/joke/'+jokeType).then( response=> response.json()).catch(

        (error)=>{
            
            $("#alertRest").show();
        }

    ).then(
        data=>{
              setupJoke(data[0].setup,data[0].punchline);
              $("#jokeModal").modal('show');
             

              })

}

function setupJoke(setup,punchline)
{

  $("#Motivation").html(setup);
  $("#pun").html(punchline);


}
