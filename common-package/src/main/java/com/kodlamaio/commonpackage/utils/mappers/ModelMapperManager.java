package com.kodlamaio.commonpackage.utils.mappers;

import org.modelmapper.ModelMapper;

public class ModelMapperManager implements ModelMapperService {
    @Override
    public ModelMapper forResponse() {
        return null;
    }

    @Override
    public ModelMapper forRequest() {
        return null;
    }
}
