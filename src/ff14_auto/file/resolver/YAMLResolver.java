package ff14_auto.file.resolver;

import org.springframework.stereotype.Component;

import java.io.File;


/**
 * @author : 陈征
 * @date : 2021-07-02 19:35
 */

@Component
public class YAMLResolver implements FileResolver {
    @Override
    public boolean check(char firstChar) {
        return firstChar == '-';
    }

    @Override
    public void resolve(File file) {
    }
}
