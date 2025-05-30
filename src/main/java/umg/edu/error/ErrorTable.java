package umg.edu.error;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Tabla para almacenar y gestionar errores de compilación
 */
public class ErrorTable {
    private final List<CompilationError> errors;
    
    public ErrorTable() {
        errors = new ArrayList<>();
    }
    
    /**
     * Agregar un error a la tabla de errores
     * @param error El error a agregar
     */
    public void addError(CompilationError error) {
        errors.add(error);
    }
    
    /**
     * Obtener todos los errores en la tabla
     * @return Lista de todos los errores
     */
    public List<CompilationError> getAllErrors() {
        return new ArrayList<>(errors);
    }
    
    /**
     * Obtener errores de un tipo específico
     * @param type El tipo de errores a obtener
     * @return Lista de errores del tipo especificado
     */
    public List<CompilationError> getErrorsByType(CompilationError.ErrorType type) {
        return errors.stream()
                .filter(error -> error.getType() == type)
                .collect(Collectors.toList());
    }
    
    /**
     * Obtener el número de errores en la tabla
     * @return El número de errores
     */
    public int size() {
        return errors.size();
    }
    
    /**
     * Verificar si hay algún error en la tabla
     * @return true si hay errores, false en caso contrario
     */
    public boolean hasErrors() {
        return !errors.isEmpty();
    }
    
    /**
     * Verificar si hay errores de un tipo específico
     * @param type El tipo de errores a verificar
     * @return true si hay errores del tipo especificado, false en caso contrario
     */
    public boolean hasErrorsOfType(CompilationError.ErrorType type) {
        return errors.stream().anyMatch(error -> error.getType() == type);
    }
    
    /**
     * Limpiar todos los errores de la tabla
     */
    public void clear() {
        errors.clear();
    }
} 