package pengguna;

 
    public class Mhs extends User {
        private String Nama;
        private String Nim ;
        private int Smt;
    
        public Mhs(String username, String password){
        super("ini_username", "ini_password");

}

public void setNama(String Nama) {
    this.Nama = Nama;
}
public String getNama(){
    return this.Nama;
}


public void setNim(String Nim){
    this.Nim = Nim;
}
public String getNim(){
    return this.Nim;
}


public void setSmt(int Smt){
    this.Smt = Smt;
}
public int getSmt(){
    return this.Smt;
}

    }