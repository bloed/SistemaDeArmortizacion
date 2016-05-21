package Factory;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class Factory
    {
        public static <T> T Crear(String id, Object... parametros) throws InstantiationException
        {
          try{
            Class<?>[] claseParametros = new Class<?>[parametros.length];
            for (int i = 0; i < claseParametros.length; i++) {
              claseParametros[i] = parametros[i].getClass();
            }
            Class<?> clase = Class.forName(id);
            Constructor<?> constructor = clase.getDeclaredConstructor(claseParametros);
            return (T) constructor.newInstance(parametros);
          }catch(NoSuchMethodException | InstantiationException | 
                  InvocationTargetException | IllegalAccessException |
                  ClassNotFoundException ex ){
            throw new InstantiationException("No ha sido posible instanciar.");
          }
        }
    }
