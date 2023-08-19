USE crm_for_telegram;

CREATE TABLE IF NOT EXISTS `users` (
	`id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `login` VARCHAR(50) character SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
    `password` VARCHAR(255) COLLATE utf8mb4_general_ci NOT NULL,
    `is_admin` TINYINT(1) DEFAULT '0',
    `created_at` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
