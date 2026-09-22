# 朵拉云手册

## 介绍

朵拉云用于文件的冗余备份。文件将可用于备份到多处，如朵拉云站点、阿里OSS、去中心化链上云（待开发）。各个节点的URL用户
拥有直接访问权限，无需经过平台。另外，朵拉盒子的数据也存入朵拉云，共用存储空间。存储空间支持使用稳定币购买以扩容，也支
持开通VIP享限时存储空间容量。存储到朵拉云的文件使用ERC-20地址进行索引。

## FAQs

**Q1: What is the maximum file size supported?**

A: The official upload limit is 4 GB per file.

**Q2: Why is there a limit on the number of files in addition to the storage capacity limit?**

A: Dora Cloud is mainly designed to back up DPK files from Dora Box. A single DPK file is typically 
only a few hundred KB, and any remaining capacity can be used to back up other files.