package himedia.kdt.dao;

import java.util.List;

import himedia.kdt.vo.UserVo;

public interface UserDao {
	public List<UserVo> getList();
	public boolean insert(UserVo userVo);
	public boolean update(UserVo userVo);
	public boolean delete(Integer no);
	public UserVo getUserByIdAndPassword(
			String email, String Password);
}
