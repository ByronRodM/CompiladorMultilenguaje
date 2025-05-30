package umg.edu.symboltable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Tabla de símbolos para almacenar y gestionar los identificadores del programa
 */
public class SymbolTable {
    private final Map<String, List<Symbol>> symbols;
    
    public SymbolTable() {
        symbols = new HashMap<>();
    }
    
    /**
     * Agregar un símbolo a la tabla de símbolos
     * @param symbol El símbolo a agregar
     */
    public void addSymbol(Symbol symbol) {
        String key = symbol.getName() + ":" + symbol.getScope();
        if (!symbols.containsKey(key)) {
            symbols.put(key, new ArrayList<>());
        }
        symbols.get(key).add(symbol);
    }
    
    /**
     * Buscar símbolos por nombre y ámbito
     * @param name El nombre del símbolo
     * @param scope El ámbito del símbolo
     * @return Lista de símbolos coincidentes
     */
    public List<Symbol> lookup(String name, String scope) {
        String key = name + ":" + scope;
        return symbols.getOrDefault(key, new ArrayList<>());
    }
    
    /**
     * Verificar si un símbolo existe en el ámbito especificado
     * @param name El nombre del símbolo
     * @param scope El ámbito a verificar
     * @return true si el símbolo existe, false en caso contrario
     */
    public boolean exists(String name, String scope) {
        String key = name + ":" + scope;
        return symbols.containsKey(key) && !symbols.get(key).isEmpty();
    }
    
    /**
     * Obtener todos los símbolos en la tabla de símbolos
     * @return Una lista plana de todos los símbolos
     */
    public List<Symbol> getAllSymbols() {
        List<Symbol> allSymbols = new ArrayList<>();
        for (List<Symbol> symbolList : symbols.values()) {
            allSymbols.addAll(symbolList);
        }
        return allSymbols;
    }
    
    /**
     * Limpiar la tabla de símbolos
     */
    public void clear() {
        symbols.clear();
    }
    
    /**
     * Obtener el número de símbolos en la tabla
     * @return El número de símbolos
     */
    public int size() {
        int count = 0;
        for (List<Symbol> symbolList : symbols.values()) {
            count += symbolList.size();
        }
        return count;
    }
} 