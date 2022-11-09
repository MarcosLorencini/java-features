package lambda.functionalinterfaces;

public class InterfacesFuncionaisDoPacoteJavaUtilFunction {
    //As interfaces descritas aqui estão disponíveis no pacote java.util.function. Nesta seção serão
    //apresentadas apenas suas definições, pois há posteriormente uma seção específica para tratar dos
    //exemplos de cada uma.
    //Existem outras interfaces nesse pacote além das listadas aqui, porém são apenas específicas para
    //lidar com tipos primitivos, seguindo as mesmas definições.
    //• Supplier<T>: Representa um fornecedor de resultados.
    //Um Supplier literalmente apenas fornece dados ou resultados para alguém. Um gerador de
    //números sequenciais, por exemplo, pode ser um Supplier.
    //• Consumer<T>: Representa uma operação que aceita uma única entrada e não possui retorno.
    //• BiConsumer<T,U>: Representa uma operação que aceita duas entradas e não possui retorno.
    //Os Consumer são praticamente o inverso dos Supplier, pois eles apenas recebem dados ou
    //informações e os tratam de alguma forma.
    //• Function<T,R>: Representa uma função que aceita um argumento e produz um retorno.
    //• BiFunction<T,U,R>: Representa uma função que aceita dois argumentos e produz um retorno.
    //As Function são mais parecidas com as funções que já conhecemos. Elas recebem dados e
    //produzem um retorno.
    //• Predicate<T>: Representa uma proposição (função de valor booleano) de um argumento.
    //• BiPredicate<T,U>: Representa uma proposição (função de valor booleano) de dois argumentos.
    //Os Predicate são parecidos com as Function, porém sempre retornam um resultado booleano,
    //por isso são utilizados para "testes" de verdadeiro ou falso.
    //• UnaryOperator<T>: Representa uma operação em um único operador que produz um resultado
    //do mesmo tipo dele.
    //• BinaryOperator<T>: Representa uma operação em dois operadores que produz um resultado do
    //mesmo tipo deles.
    //Os Operator são especializações de Function, pois apesar de também sempre recebem e
    //produzirem resultados, as entradas e saídas são sempre do mesmo tipo.
}
