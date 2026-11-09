# Microsoft’s Own Encryption, and It Cannot Even Keep It Safe

## — Two High-Severity Vulnerabilities Disclosed for Windows EFS in Two Days. What Exactly Is Your Encryption Protecting?

Two days ago, Microsoft Security Response Center (MSRC) released two security advisories back-to-back.

The first: **CVE-2026-85791**, a privilege escalation vulnerability in the Windows Encrypting File System (EFS), rated **Important** under the CVSS scale. Attackers could exploit a heap buffer overflow to gain elevated system privileges.

The second: **CVE-2026-83565**, an information disclosure vulnerability in the Windows Encrypting File System (EFS). Attackers can leverage this flaw to access encrypted file information they should never be allowed to see.

Two advisories, two vulnerabilities, targeting the same component: **Windows’ built-in Encrypting File System**.

EFS is no niche feature. It has been part of the operating system since Windows 2000, used by hundreds of millions of businesses and individuals worldwide to encrypt local files. Many people assume, *“Turning on Windows encryption is enough”* — their sense of security rests on this now-flawed foundation.

---

## What This Means

Let’s examine these two vulnerabilities together:

**Vulnerability 1 (85791): Privilege Escalation**
An attacker starting with only standard user rights can use the EFS heap buffer overflow to obtain system-level privileges. With system access, the attacker can take full control: install backdoors, alter configurations, and read every file on the machine.

**Vulnerability 2 (83565): Information Disclosure**
Attackers can directly retrieve metadata and details tied to EFS-encrypted files. Microsoft has not published the full scope of exposed data, but “information disclosure” alone is deeply concerning. EFS exists to prevent leaks — yet it has itself become the leak vector.

Combined, these flaws create a dangerous chain: an attacker can use the first vulnerability to gain system access, then use the second to extract information about encrypted files.
**The encryption system you rely on to guard your files becomes the gateway for attackers to compromise them.**

This is not EFS’ first security incident. Microsoft’s patches will fix these two specific bugs, but history shows: patching today’s flaws does not stop tomorrow’s. In the first half of 2026, 35,467 new vulnerabilities were disclosed globally, a 51.9% year-over-year increase. Vulnerabilities are not rare accidents; they are an inherent property of complex software.
**Any sufficiently complex encryption implementation will keep introducing new vulnerabilities.**

---

## Three Structural Flaws in OS-Level Encryption

EFS’ failures are not simply because Microsoft has fallen short. Operating-system-native encryption comes with three built-in structural limitations:

**First: Keys live inside the OS.**
EFS encryption keys are managed by Windows and stored within protected operating-system storage. That means keys and ciphertext reside on the same machine, inside the same OS. Once an attacker gains system privileges (for instance via CVE-2026-85791), they obtain both ciphertext *and* keys.

It is like locking your diary inside a safe, yet hanging the safe’s key on the back of the safe’s handle. It is convenient for daily use — but once an attacker breaches the safe enclosure, both key and diary are exposed together.

**Second: A massive attack surface.**
An operating system is extraordinarily complex. Windows comprises tens of millions of lines of code, and EFS is only one small module within it. But EFS must interface with many other OS subsystems: the file system, user identity management, access controls, and network services. Every single integration point is a potential source of vulnerabilities.

Think of a castle: the outer wall (EFS encryption) may look sturdy, yet the castle has dozens of gates, hundreds of windows, and thousands of service ducts. Attackers do not need to break through the wall — they only need to find one unsecured window.

**Third: Patch latency.**
There is a gap between vulnerability discovery and patch deployment. Verizon’s report notes that in 2026, 30.2% of high-severity vulnerabilities were exploited on the very day of public disclosure. Microsoft has released patches for these two EFS flaws — but until you install them (and many users never update promptly), your system remains exposed.

---

## Application-Layer Encryption: Pull the Keys Out of the Operating System

The security industry’s response to these inherent limitations of OS encryption is clear:
**Move encryption from the operating-system layer to the application layer.**

What does that mean?
With application-layer encryption, cryptographic operations run inside a standalone application. The app manages its own keys independently, with no reliance on the operating system’s native security mechanisms.

**DoraBox is a typical example of an application-layer encryption tool.**

Its core difference from EFS can be summed up as follows:

- **How EFS works**: The operating system encrypts your files, and keys are stored within the OS. Your security hinges entirely on the OS remaining bug-free.
- **How DoraBox works**: DoraBox performs encryption itself. Keys are generated and managed locally on your device, independent of OS key storage. Your security does not depend on whether the underlying operating system is secure.

This distinction matters enormously in the wake of these EFS disclosures.

If an attacker gains system privileges via an EFS vulnerability:

- **EFS-encrypted files**: Ciphertext and keys both reside in the OS → attackers can decrypt the data → exposure.
- **DoraBox-encrypted files**: Ciphertext sits inside DoraBox’s encrypted vault, with keys managed separately by DoraBox. Even with full system access, DoraBox’s key store remains isolated → the attacker still cannot retrieve the keys.

This is not to claim DoraBox is unbreakable — no system can make that guarantee. Rather,
**DoraBox shifts your security assumption from “the operating system will have no vulnerabilities” to “the underlying cryptography itself is strong.”**
The former is an assumption repeatedly proven false; the latter is backed by mathematical proof.

---

## DoraBox Technical Overview

For those interested in the technical design, here is how DoraBox handles encryption:

**Key Architecture: Zero-Knowledge Design**
Encryption keys are generated locally on your device. They never leave your device and are never uploaded to DoraBox servers. The DoraBox development team holds none of your encryption keys. Even if DoraBox’s backend infrastructure were fully compromised, attackers would obtain nothing but unusable ciphertext.

**Cipher Suite: AES-256-GCM**
This is one of the highest-grade civilian cryptographic standards available today. Paired with the Argon2id key derivation function (resistant to GPU brute-force attacks) and X25519 key encapsulation (built for post-quantum migration), DoraBox’s encryption stack represents cutting-edge industry practice as of 2026.

**No Plaintext Window Across the Full Pipeline**
Files are encrypted locally on your device before being written to storage. Data stays encrypted in transit, at rest, and during cross-device sync. Decryption and plaintext rendering only happen on your authorized devices. There is no intermediate plaintext staging point anywhere in the workflow.

**Self-Destruct Mechanism**
After repeated failed authentication attempts, the local key material is erased. Your ciphertext files remain in place, but until you complete the full identity recovery workflow, they are effectively meaningless noise. Brute-force attempts do not aim to “crack the safe open” — they risk triggering the safe’s own key erasure.

---

## Why Post-Quantum Readiness Matters

When discussing DoraBox’s design, one term deserves extra attention: **post-quantum migration**.

Commercial quantum computing is accelerating in 2026. The security community widely recognizes the “Harvest Now, Decrypt Later” attack pattern: attackers do not try to decrypt your data today. They simply store captured ciphertext and wait until quantum computers are powerful enough to break it later.

What does that mean for you?
If you encrypt a file today using traditional algorithms, attackers can effectively “reserve” it for future cracking. It may stay secure for now, but could be decrypted in five or ten years once quantum capabilities mature. Today’s security does not equal long-term security.

DoraBox’s architecture includes an upgrade path for post-quantum algorithms. When quantum threats become practical, the key encapsulation layer can transition to quantum-resistant standards.
**Data you store today stays protected in the quantum era.**

This is not alarmism. It is a consensus across the 2026 cybersecurity industry:
Post-quantum encryption is no longer a “future requirement” — it is a requirement for today.
Data you store now will still exist when quantum threats arrive.

---

## One Action You Can Take Right Now

Check what tool you use for file encryption on your computer.

If you rely on Windows EFS: verify whether you have installed the November security rollup (KB patch). Until you do, your so-called “encrypted” files remain exposed to these two known vulnerabilities.

If you want an encryption scheme that does not depend on the operating system’s security posture, DoraBox is built for exactly that scenario.

**DoraBox does not replace operating-system security controls. It adds an independent layer of protection that sits above and outside the OS trust boundary.**

Is the operating system secure? The two recent CVEs answer that question.
Is DoraBox secure? Its security model does not rely on that answer.

That is the value of application-layer encryption: your data security should not rest on the repeatedly invalidated assumption that your operating system will remain free of vulnerabilities.

---

*DoraBox — Encrypted private data storage, zero-knowledge architecture, local key management, zero plaintext exposure end-to-end, encryption engineered for the post-quantum era.*