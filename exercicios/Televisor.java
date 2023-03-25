public class Televisor {
    // Atributos da classe Televisor
    private int canal = 1;
    private int volume = 0;
    private boolean ligado = false;
    
    // Métodos da classe televisor
    public void aumentarVolume(){
    if (ligado == true){
        if (volume == 10) System.out.println("Erro: Volume atualmente no máximo.");
        else volume += 1;
    } else{
        System.out.println("Televisor desligado, não é possível aumentar volume.");
    }} 

    public void reduzirVolume() {
    if (ligado == true){
        if (volume == 0) System.out.println("Erro: Volume atulmente no mínimo");
        else volume -= 1;
    }else{
        System.out.println("Televidor desligado, não é possível reduzir o volume.");
    }}

    public void subirCanal() {
    if (ligado == true){
        if (canal == 16) System.out.println("Erro: O canal atual é o maior.");
        else canal +=1;
    }else{
        System.out.println("Televisor desligado, não é possível subir o canal.");
    }}
    
    public void descerCanal() {
    if (ligado == true){
        if (canal == 1) System.out.println("Erro canal atual é o menor");
        else canal -=1;
    }else{
        System.out.println("Televisor desligado, não é possível descer o canal.");
    }}

    public void ligarTelevisor() {
        if (ligado == true) System.out.println("O televisor está atualmente ligado");
        else ligado = true;
    }

    public void desligarTelevisor() {
        if (ligado == false){
            System.out.println("Televiso atualmente desligado");
        }
        else {
            ligado = false;
            canal = 1;
            volume = 0;
        }

    }

    public void mostraStatus() {
        if (ligado == true){
            System.out.println("----------------");
            System.err.println("Televisor ligado");
            System.out.print("Canal atual: ");
            System.out.println(canal);
            System.out.print("Volume atual: ");
            System.out.println(volume);
            System.out.println("----------------");
        }else{
            System.out.println("----------------");
            System.out.println("Televisor desligado");
            System.out.println("Canais e volume estão no nível padrão");
            System.out.println("----------------");
        }
    }


    public static void main(String[] args) {
        Televisor meuTelevisor = new Televisor();
        meuTelevisor.mostraStatus();
        System.out.println("Ligando o televisor...");
        meuTelevisor.ligarTelevisor();
        meuTelevisor.mostraStatus();
        System.out.println("Vamos aumentar o volume do televisor:");
        meuTelevisor.aumentarVolume();
        meuTelevisor.mostraStatus();
        System.out.println("Por hoje já está bom de assistir o Faustão, vamos desligar:");
        meuTelevisor.desligarTelevisor();
        meuTelevisor.mostraStatus();

        //Tentando aumentar o canal e o volume enquanto o Televisor está desligado:
        meuTelevisor.aumentarVolume();
        meuTelevisor.subirCanal();
        
    }
}

