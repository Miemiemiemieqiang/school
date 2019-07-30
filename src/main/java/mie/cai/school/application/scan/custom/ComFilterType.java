package mie.cai.school.application.scan.custom;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * ComFilterType class
 *
 * @author caikaiqiang on 2019-07-30
 */
public class ComFilterType implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        return metadataReader.getAnnotationMetadata().getClassName().contains("Service");
    }
}
