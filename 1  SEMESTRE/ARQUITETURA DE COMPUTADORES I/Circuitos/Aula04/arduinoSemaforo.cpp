#define VERDE A3
#define AMARELO A4
#define VERMELHO A5

//1 vez
void setup() {
    pinMode(VERDE, OUTPUT);
    pinMode(AMARELO, OUTPUT);
    pinMode(VERMELHO, OUTPUT);
}

//infinitas vezes
void loop() {
    //pode ser também como:
    //digitalWrite(VERDE, TRUE);
    digitalWrite(VERDE, HIGH);
    delay(3000); //fica verde por 3s ou 3000mS

    //pode ser também como:
    //digitalWrite(VERDE, FALSE);
    digitalWrite(VERDE, LOW);
    
    //digitalWrite(AMARELO, TRUE);
    digitalWrite(AMARELO, HIGH);
    delay(20000); //fica amarelo por 2s ou 2000mS

    //digitalWrite(AMARELO, FALSE);
    digitalWrite(AMARELO, LOW);
    
    //digitalWrite(VERMELHO, TRUE);
    digitalWrite(VERMELHO, HIGH);
    delay(3000); //fica vermelho por 3s ou 3000mS

    //digitalWrite(VERMELHO, FALSE);
    digitalWrite(VERMELHO, LOW);
}