-- phpMyAdmin SQL Dump
-- version 5.2.1deb1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Waktu pembuatan: 01 Jul 2024 pada 10.03
-- Versi server: 10.11.6-MariaDB-0+deb12u1
-- Versi PHP: 8.2.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pemkom`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `akun`
--

CREATE TABLE `akun` (
  `id` int(11) NOT NULL,
  `email` varchar(360) NOT NULL,
  `sandi` char(32) NOT NULL,
  `nama` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `akun`
--

INSERT INTO `akun` (`id`, `email`, `sandi`, `nama`) VALUES
(1, 'adit@mail.com', '202cb962ac59075b964b07152d234b70', 'adit'),
(2, 'rangga@gmail.com', '25d55ad283aa400af464c76d713c07ad', 'Rangga'),
(3, 'angga@gmail.com', '81dc9bdb52d04dc20036dbd8313ed055', 'angga');

-- --------------------------------------------------------

--
-- Struktur dari tabel `mitra`
--

CREATE TABLE `mitra` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `pendalaman_survei` int(11) NOT NULL,
  `perilaku` int(11) NOT NULL,
  `kualitas_pekerjaan` int(11) NOT NULL,
  `ketepatan_waktu` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `mitra`
--

INSERT INTO `mitra` (`id`, `nama`, `pendalaman_survei`, `perilaku`, `kualitas_pekerjaan`, `ketepatan_waktu`) VALUES
(1, 'CV. Prima Data Statistik', 4, 5, 3, 4),
(2, 'CV. Anugerah Data Statistik', 5, 4, 4, 1),
(3, 'CV. Mitra Statistik Informasi', 5, 3, 5, 3),
(4, 'CV. Cipta Statistik Mandiri', 3, 1, 3, 4),
(8, 'cv. bidan ', 1, 2, 3, 4);

-- --------------------------------------------------------

--
-- Struktur dari tabel `riwayat_spk`
--

CREATE TABLE `riwayat_spk` (
  `id` int(11) NOT NULL,
  `judul` varchar(100) NOT NULL,
  `akun_id` int(11) NOT NULL,
  `w1` int(11) NOT NULL,
  `w2` int(11) NOT NULL,
  `w3` int(11) NOT NULL,
  `w4` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `riwayat_spk`
--

INSERT INTO `riwayat_spk` (`id`, `judul`, `akun_id`, `w1`, `w2`, `w3`, `w4`) VALUES
(1, 'BPS tahun 2024', 3, 4, 3, 5, 3);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `mitra`
--
ALTER TABLE `mitra`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `riwayat_spk`
--
ALTER TABLE `riwayat_spk`
  ADD PRIMARY KEY (`id`),
  ADD KEY `riwayat_spk_akun_fk` (`akun_id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `akun`
--
ALTER TABLE `akun`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `mitra`
--
ALTER TABLE `mitra`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT untuk tabel `riwayat_spk`
--
ALTER TABLE `riwayat_spk`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `riwayat_spk`
--
ALTER TABLE `riwayat_spk`
  ADD CONSTRAINT `riwayat_spk_akun_fk` FOREIGN KEY (`akun_id`) REFERENCES `akun` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
