/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command1;

/**
 *
 * @author user
 */
public class DeleteCommand implements Command{
    Database database;
    public DeleteCommand(Database database){
     this.database = database;
    }
    @Override
    public void execute(){
        database.delete();
    }
}

