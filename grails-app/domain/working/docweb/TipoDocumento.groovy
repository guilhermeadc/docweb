package working.docweb

class TipoDocumento {

    String nome

    static constraints = {
        nome blank: false, unique: true
    }

    @Override
    String toString() {
        return (nome != null && nome != '') ? nome.toString() : super.toString()
    }
}
