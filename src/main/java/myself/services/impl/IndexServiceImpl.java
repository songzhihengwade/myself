package myself.services.impl;

import myself.mapper.IndexMapper;
import myself.services.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("indexService")
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
