package no1;

/*
Nama      : Arvina Yudithia Sompie.
Kelas    	: B2
hari/tgl  : Sabtu, 2 Mei 2020
 */
public class login {
    public String username;
    public int password; 
    
    public login(String username, int password){
        this.username = username;
        this.password = password;
    }
}

class runlogin{
    public static void main(String[] args){
        login user = new login("Arvina",12345);
        System.out.println("Username = "+user.username);
        System.out.println("Password = "+user.password);
    }
}