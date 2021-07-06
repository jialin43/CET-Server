#!/bin/bash
# 设置mysql的登录用户名和密码(根据实际情况填写)
mysql_user="root"
mysql_password="Cet123456"
mysql_host="localhost"
mysql_port="3306"
mysql_charset="utf8mb4"
 
# 备份文件存放地址(根据实际情况填写)
backup_location="/root/Cet/cetbackup"
 
# 是否删除过期数据
expire_backup_delete="ON"
expire_days=30
backup_time=`date +%Y%m%d%H%M`
backup_dir=$backup_location
welcome_msg="Welcome to use MySQL backup tools!"
# 备份指定数据库中数据(此处假设数据库是mysql_backup_test)

docker exec -it mysql mysqldump -h$mysql_host -P$mysql_port -u$mysql_user -p$mysql_password -B cetdemo > $backup_dir/cetdemo-$backup_time.sql

 
# 删除过期数据
if [ "$expire_backup_delete" == "ON" -a  "$backup_location" != "" ];then
        `find $backup_location/ -type f -mtime +$expire_days | xargs rm -rf`
        echo "Expired backup data delete complete!"
fi
echo "Backup complete!"