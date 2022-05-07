package decorator;

import java.io.IOException;
import java.io.InputStream;
import java.util.function.IntPredicate;

public class ByteFilterInputStream extends InputStream {

    private InputStream is;

    private IntPredicate predicate;

    public ByteFilterInputStream(InputStream is, IntPredicate predicate) {
        this.is =is;
        this.predicate = predicate;
    }

    @Override
    public int read() throws IOException {
        int result = is.read();
        while (result != -1 && !predicate.test(result)) {
            result = is.read();
        }
        return result;
    }
}
