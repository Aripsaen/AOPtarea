package singleton;

public abstract class Usuario {
    protected String user;
    protected String contraseña;
    protected String name;
    protected String lastName;

    public Usuario(String user, String contraseña, String name, String lastName) {
        this.user = user;
        this.contraseña = contraseña;
        this.name = name;
        this.lastName = lastName;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }else if (obj != null && obj instanceof Usuario){
            Usuario other = (Usuario) obj;
            return (this.user.equals(other.user) && this.contraseña.equals(other.contraseña) );
        }
        return false;
    }
    
    @Override
    public String toString() {
    	   return this.name + " " +this.lastName;
    	}

}
