public class axolot extends ViziAllat implements Ragadozo {

    public axolot(String nev) {
        super(nev);
    }



        @Override
        public String hangotad() {
            return "lubic";
        }

        @Override
        public void eszik(Allat mit) {
            System.out.println(this.getNev()+" jól lakott gilisztával.");
            this.setJollakotsag(100);

        }

        public  void pihenes (int mennyit) {

        }


    public String toString() {
        return super.toString();
    }

}
