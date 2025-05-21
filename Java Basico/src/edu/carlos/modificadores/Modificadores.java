package edu.carlos.modificadores;

public class Modificadores {
    public static void main(String[] args) {
        // Modificadores de acesso em Java:
// public, private, protected e "default" (quando nenhum modificador é usado)

// public: acessível em qualquer lugar
// private: acessível apenas dentro da classe onde foi declarado
// protected: acessível dentro do mesmo pacote e por subclasses
// default (sem modificador): acessível apenas dentro do mesmo pacote

// --------------------
// Modificadores de acesso em CLASSES (top-level)
// --------------------

// public class PublicClass {}        // ✅ Válido
// class DefaultClass {}              // ✅ Válido (default, sem modificador)
// private class PrivateClass {}      // ❌ Inválido (classes top-level não podem ser private)
// protected class ProtectedClass {}  // ❌ Inválido (classes top-level não podem ser protected)

// --------------------
// Modificadores de acesso em MÉTODOS (em classes)
// --------------------

// public void publicMethod() {}      // ✅
// private void privateMethod() {}    // ✅
// protected void protectedMethod() {}// ✅
// void defaultMethod() {}            // ✅ (default = sem modificador)

// --------------------
// Modificadores de acesso em ATRIBUTOS (em classes)
// --------------------

// public String publicAttribute;     // ✅
// private String privateAttribute;   // ✅
// protected String protectedAttribute; // ✅
// String defaultAttribute;           // ✅ (default = sem modificador)

// --------------------
// Modificadores de acesso em CONSTRUTORES
// --------------------

// public Modificadores() {}          // ✅
// private Modificadores() {}         // ✅
// protected Modificadores() {}       // ✅
// Modificadores() {}                 // ✅ (default)

// --------------------
// Modificadores de acesso em CLASSES INTERNAS
// --------------------

/* class OuterClass {
    public class PublicInnerClass {}     // ✅
    private class PrivateInnerClass {}   // ✅
    protected class ProtectedInnerClass {} // ✅
    class DefaultInnerClass {}           // ✅ (default)
}
 */
// --------------------
// Modificadores de acesso em INTERFACES (top-level)
// --------------------

// public interface PublicInterface {}   // ✅
// interface DefaultInterface {}         // ✅ (default = sem modificador)
// private interface PrivateInterface {} // ❌ Inválido
// protected interface ProtectedInterface {} // ❌ Inválido

        
}

}
