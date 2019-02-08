package com.objis.cameroun.ouverturecomptes.domaine;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class UserModel extends AbstractTableModel {

    private final String[] entetes = {"Identifiant","Nom","Prenom","Age","CIN","Profession","Telephone","Email","Adresse","Login","Password"};
    

    private List<User> users;

    public UserModel(List<User> users) {  
        this.users = users; 
    }

    

	public List<User> getUsers() {
		return users;
	}



	public void setUsers(List<User> users) {
		this.users = users;
	}



	@Override
	public int getRowCount() {
		return users.size();
	}


	@Override
	public int getColumnCount() {
		return entetes.length;
	}
	
	

	@Override
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }


	
	
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {

            case 0:
                // ID
                return users.get(rowIndex).getIdentifiant();

            case 1:
                // Nom
                return users.get(rowIndex).getNom();
            case 2:
                // Prenom
                return users.get(rowIndex).getPrenom();
            case 3:
                // Age
                return users.get(rowIndex).getAge();
            case 4:
                // CIN
                return users.get(rowIndex).getCin();
            case 5:
                // Profession
                return users.get(rowIndex).getProfession();
            case 6:
                // Telephone
                return users.get(rowIndex).getTelephone();

            case 7:
                // Email
                return users.get(rowIndex).getEmail();
            case 8:
                // Adresse
                return users.get(rowIndex).getAdresse();
            case 9:
                // Login
                return users.get(rowIndex).getLogin();
            case 10:
                // Password
                return users.get(rowIndex).getPassword();              
            default:
                throw new IllegalArgumentException();

        }
       
       
    }



}
