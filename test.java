//connect to API

//decode the json response

//create a class to hold the data
//  read the json data into the class
//  read actual word from the API
//  Read all attempts from all players
//  Read all used letters from all players
//  update player values in GUI

//if the player wishes to play the game and they have 0 attempts left
//  send a request to the API for the game status
//  if the game is not active
//      send a request to the API to start the game
//      if the game is started
//          update the GUI with the game status  
//          if input word/letter is longer than 1 letter its a word else its a letter
//               if its a word compare it to the actual word
//                   if its not equal to the actual word
//                       increase attempts by 1
//                       call the function to update the GUI
//                   else
//                       send win status to the API
//               else check if the letter is in the used letters list
//                   if check if letter is present in actual word
//                       if its present in the actual word
//                           add the letter to the used letters list
//                           call the function to update the GUI
//                       else
//                           add the letter to the used letters list
//                           increase attempts by 1
//                           call the function to update the GUI
//                   else 
//                       add the letter to the used letters list
//                       increase attempts by 1
//                       call the function to update the GUI
//           check if attempts are not equal to 0
//               if attempts are equal to 0
//                   send lose status to the API
//                   call the function to update the GUI
//                   break/die or whatever the command for it is in java
//               else
//                   call the function to update the GUI and say the game is still active
//                   break/die or whatever the command for it is in java
//           else
//               ...TODO
//  else
//      ...TODO
/*Logic isnt done check from  top to bottom again*/

