package myself.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import myself.mapper.IndexMapper;
import myself.services.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    private IndexMapper indexMapper;

    @Override
    public List<String> getAllUserName() {
        List<String> names = null;
        names = indexMapper.getAllUserName();
        return names;
    }
}
